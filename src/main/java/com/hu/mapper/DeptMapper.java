package com.hu.mapper;

import com.hu.domain.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 15:44
 */
@Mapper
public interface DeptMapper {

    //查询所有员工的所在部门
    List<Department> findAll();
}
