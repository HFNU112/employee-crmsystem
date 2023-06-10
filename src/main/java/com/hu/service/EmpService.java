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

}
