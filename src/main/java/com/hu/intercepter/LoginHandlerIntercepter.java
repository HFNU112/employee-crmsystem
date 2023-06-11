package com.hu.intercepter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Husp
 * @date: 2023/6/11 7:51
 */
public class LoginHandlerIntercepter implements HandlerInterceptor {

    //登录拦截器执行目标方法前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从session中获取登录用户信息
        Object loginUser = request.getSession().getAttribute("loginUser");

        //判断是否有用户信息
        if (loginUser == null) {
            //没有用户，返回登录页面
            request.setAttribute("msg", "对不起，您还有权限登录~");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            //放行
            return true;
        }
    }
}
