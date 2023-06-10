package com.hu.controller;

import com.hu.domain.Emp;
import com.hu.domain.PageBean;
import com.hu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: Husp
 * @date: 2023/6/10 10:30
 */
@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    /**
     * 查询员工列表
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

        model.addAttribute("emp", emp);
        model.addAttribute("pb", pb);
        return "emp/list";
    }
}
