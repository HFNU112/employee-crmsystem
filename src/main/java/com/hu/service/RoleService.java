package com.hu.service;

import com.hu.domain.PageBean;
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
    PageBean<Role> findAllRole(PageBean<Role> pageBean, Role role);

    //删除角色
    void deleteById(Long id);
}
