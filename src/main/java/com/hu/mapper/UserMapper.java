package com.hu.mapper;

import com.hu.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: Husp
 * @date: 2023/6/9 1:12
 */
@Mapper
public interface UserMapper {

    //根据用户名和密码查询用户
    User findByUser(@Param("username") String username, @Param("password") String password);

}
