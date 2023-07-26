package com.hu.controller;

import com.hu.domain.Department;
import com.hu.domain.Emp;
import com.hu.domain.PageBean;
import com.hu.service.DeptService;
import com.hu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 10:30
 */
@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    @Resource
    private DeptService deptService;

    /**
     * 模糊查询员工列表
     * @param pageBean
     * @param emp
     * @param model
     * @return
     */
    @GetMapping("/emps")
    public String emp(PageBean<Emp> pageBean, Emp emp, Model model){
        if (pageBean.getCurrentPage() == null || "".equals(pageBean.getCurrentPage())){
            pageBean.setCurrentPage(1);
        }
        if (pageBean.getPageSizes() == null || "".equals(pageBean.getPageSizes())){
            pageBean.setPageSizes(5);
        }
        PageBean<Emp> pb = empService.findAll(pageBean, emp);
        List<Department> depts = deptService.findAll();

        model.addAttribute("emp", emp);
        model.addAttribute("depts", depts);
        model.addAttribute("pb", pb);
        return "emp/list";
    }

    /**
     * 来到添加的弹出层
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String toAddPage(Model model){
        List<Department> departments = deptService.findAll();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    /**
     * 添加员工
     * @param emp
     * @return
     */
    @PostMapping("/emp")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emps";
    }

    /**
     * 来到修改页面
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id") Long id, Model model){
        List<Department> departments = deptService.findAll();
        model.addAttribute("depts", departments);
        Emp emp = empService.findById(id);
        model.addAttribute("emp", emp);
        return "emp/add";
    }

    /**
     * 修改员工
     * @param emp
     * @return
     */
    @PutMapping("/emp")
    public String updateEmp(Emp emp){
        empService.updateEmp(emp);
        return "redirect:/emps";
    }

    /**
     * 删除单个员工
     * @param id
     * @return
     */
    @DeleteMapping("/emp/{id}")
    public String deleteById(@PathVariable("id") Long id){
        empService.deleteById(id);
        return "redirect:/emps";
    }

    /**
     * 删除选中
     * @param request
     * @return
     */
    @DeleteMapping("/emps")
    public String deleteByIds(HttpServletRequest request){
        String[] eids = request.getParameterValues("eid");
        empService.deleteByIds(eids);
        return "redirect:/emps";
    }

}
