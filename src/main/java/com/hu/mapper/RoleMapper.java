package com.hu.mapper;

import com.hu.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Husp
 * @since 2023-06-17
 */
@Mapper
public interface RoleMapper {

    //查询所有角色
    List<Role> findAll();

}
