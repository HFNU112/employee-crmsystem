package com.hu.controller;


import com.hu.service.MenuService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author Husp
 * @since 2023-06-18
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private MenuService menuService;



}

