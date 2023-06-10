package com.hu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Husp
 * @date: 2023/6/7 17:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    //主键
    private Long id;

    //账号
    private String username;

    //密码
    private String password;

    //用户昵称
    private String nickName;

    //用户类型
    private String userType;

    //手机号码
    private String phoneNumber;

    //状态
    private String status;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

}
