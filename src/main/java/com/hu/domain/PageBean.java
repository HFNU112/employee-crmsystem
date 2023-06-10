package com.hu.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Husp
 * @date: 2023/6/10 10:35
 */
@Data
public class PageBean<T> implements Serializable {

    //当前页
    private Integer currentPage;

    //每页显示几条记录
    private Integer pageSizes;

    //总页码
    private Integer totalPage;

    //总条数
    private Integer totalCount;

    //每页显示的数据
    private List<T> records;

}
