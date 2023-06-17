package com.hu.controller;


import com.hu.domain.Role;
import com.hu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Role> role(){
        return roleService.findAll();
    }

}

