package com.hu.service.impl;

import com.hu.domain.Role;
import com.hu.mapper.RoleMapper;
import com.hu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Husp
 * @since 2023-06-17
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    /**
     * 查询所有角色
     * @return
     */
    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }
}
