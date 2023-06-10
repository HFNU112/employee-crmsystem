package com.hu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Husp
 * @date: 2023/6/7 20:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {

    /** 主键*/
    private Long id;

    /**姓名*/
    private String lastName;

    /**邮箱*/
    private String email;

    /**性别*/
    private String gender;

    /**出生日期*/
    private Date birth;

    /**部门编号*/
    private Long deptId;

}
