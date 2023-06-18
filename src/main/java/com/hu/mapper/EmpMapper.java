package com.hu.mapper;

import com.hu.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 11:51
 */
@Mapper
public interface EmpMapper {

    //查询员工列表
    List<Emp> findAll(@Param("start") Integer start, @Param("pageSizes") Integer pageSizes);

    //查询总条数
    Integer findTotalCount();

    //添加员工
    void save(Emp emp);

    //根据员工id查询员工信息
    Emp findById(Long id);

    //修改员工
    void updateEmp(Emp emp);

    //删除员工
    void deleteById(Long id);

    //查询emp集合数据
    List<Emp> findPageQueryRole(@Param("start") Integer start, @Param("pageSizes") Integer pageSizes, @Param("lastName") String lastName,@Param("gender") String gender,@Param("deptId") Long deptId);

    //查询分页总数
    Integer findPageTotalCount(@Param("lastName") String lastName,@Param("gender") String gender,@Param("deptId") Long deptId);
}
