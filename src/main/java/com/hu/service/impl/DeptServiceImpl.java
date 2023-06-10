package com.hu.service.impl;

import com.hu.domain.Department;
import com.hu.mapper.DeptMapper;
import com.hu.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 15:40
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    /**
     * 查询所有员工的所在部门
     * @return
     */
    @Override
    public List<Department> findAll() {
        return deptMapper.findAll();
    }
}
