package com.hu.controller;

import com.hu.domain.User;
import com.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author: Husp
 * @date: 2023/6/8 11:13
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        User u = userService.login(user);
        if (u != null){
            session.setAttribute("loginUser", u);  //用户信息存入session
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }
}
