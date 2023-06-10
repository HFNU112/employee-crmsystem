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

    //查询总条数
    Integer findTotalCount();

    //查询员工列表
    List<Emp> findAll(@Param("start") Integer start, @Param("pageSizes") Integer pageSizes);
}
