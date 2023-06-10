package com.hu.service.impl;

import com.hu.domain.Emp;
import com.hu.domain.PageBean;
import com.hu.mapper.EmpMapper;
import com.hu.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 11:31
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    /**
     * 查询员工列表
     * @param pageBean
     * @param emp
     * @return
     */
    @Override
    public PageBean<Emp> findAll(PageBean<Emp> pageBean, Emp emp) {
        //1.获得当前页参数
        Integer currentPage = pageBean.getCurrentPage();
        //上一页按钮不能超过1
        if (currentPage < 1){
            currentPage = 1;
        }
        //2.获得每页显示几条记录
        Integer pageSizes = pageBean.getPageSizes();
        //3.新建分页列表对象
        PageBean<Emp> pb = new PageBean<>();
        pb.setCurrentPage(currentPage);
        pb.setPageSizes(pageSizes);

        //4.查询总条数
        Integer totalCount = empMapper.findTotalCount(emp.getLastName(), emp.getGender(), emp.getDeptId());
        pb.setTotalCount(totalCount);
        //5.查询每页显示的数据
        Integer start = (currentPage - 1) * pageSizes;
        List<Emp> emps = empMapper.findAll(start, pageSizes, emp.getLastName(), emp.getGender(), emp.getDeptId());
        pb.setRecords(emps);

        //6.查询总页码
        Integer totalPage = (totalCount % pageSizes)==0 ? (totalCount / pageSizes) : (totalCount / pageSizes) + 1;
        pb.setTotalPage(totalPage);
        //下一页按钮不超过最大页码
        if (currentPage > totalPage){
             currentPage = totalPage;
             pb.setCurrentPage(currentPage);
        }
        return pb;
    }

    /**
     * 添加员工
     * @param emp
     */
    @Override
    public void save(Emp emp) {
        empMapper.save(emp);
    }

    /**
     * 根据员工id查询员工信息
     * @param id
     * @return
     */
    @Override
    public Emp findById(Long id) {
        return empMapper.findById(id);
    }

    /**
     * 修改员工
     * @param emp
     */
    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp);
    }


}
