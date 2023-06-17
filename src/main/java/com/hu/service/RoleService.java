package com.hu.service;

import com.hu.domain.Role;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Husp
 * @since 2023-06-17
 */
public interface RoleService {

    //查询所有角色
    List<Role> findAll();

}
