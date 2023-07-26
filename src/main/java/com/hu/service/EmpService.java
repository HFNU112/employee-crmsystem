package com.hu.service;

import com.hu.domain.Emp;
import com.hu.domain.PageBean;

/**
 * @author: Husp
 * @date: 2023/6/10 10:52
 */
public interface EmpService {

    //查询员工列表
    PageBean<Emp> findAll(PageBean<Emp> pageBean, Emp emp);

    //添加员工
    void save(Emp emp);

    //根据员工id查询员工信息
    Emp findById(Long id);

    //修改员工
    void updateEmp(Emp emp);

    //删除单个员工
    void deleteById(Long id);

    //删除选中
    void deleteByIds(String[] ids);

}
