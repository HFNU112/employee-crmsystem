package com.hu.service.impl;

import com.hu.domain.User;
import com.hu.mapper.UserMapper;
import com.hu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Husp
 * @date: 2023/6/9 1:08
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    /**
     * 根据用户名和密码查询用户
     * @param user
     * @return
     */
    @Override
    public User login(User user) {
        User u = userMapper.findByUser(user.getUsername(), user.getPassword());
        return u;
    }
}
