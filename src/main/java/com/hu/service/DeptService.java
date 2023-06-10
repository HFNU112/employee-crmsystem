package com.hu.service;

import com.hu.domain.Department;

import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 15:38
 */
public interface DeptService {

    //查询所有员工的所在部门
    List<Department> findAll();

}
