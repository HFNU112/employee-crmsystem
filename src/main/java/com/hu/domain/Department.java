package com.hu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: Husp
 * @date: 2023/6/7 20:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {

    /**主键*/
    private Long id;

    /**部门名称*/
    private String departmentName;

}
