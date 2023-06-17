package com.hu.controller;


import com.hu.domain.PageBean;
import com.hu.domain.Role;
import com.hu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Husp
 * @since 2023-06-17
 */
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色
     * @return 角色集合
     */
    @GetMapping("/roles")
    public String findAllRole(PageBean<Role> pageBean, Role role, Model model){
        if (pageBean.getCurrentPage() == null|| "".equals(pageBean.getCurrentPage())){
            pageBean.setCurrentPage(1);
        }
        if (pageBean.getPageSizes()==null || "".equals(pageBean.getPageSizes())){
            pageBean.setPageSizes(5);
        }
        PageBean<Role> pb = roleService.list(pageBean, role);
        model.addAttribute("pb",pb);
        model.addAttribute("role", role);
        return "role/list";
    }

}

