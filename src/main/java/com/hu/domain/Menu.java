package com.hu.domain;


import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 菜单表
 * </p>
 *
 * @author Husp
 * @since 2023-06-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 所属父节点
     */
    private Long parentId;

    /**
     * 所有的父节点
     */
    private String parentIds;

    /**
     * 是否为叶子节点 0叶子节点 1非叶子节点
     */
    private Integer isLeaf;

    /**
     * 菜单名
     */
    private String menuName;

    /**
     * 菜单路径
     */
    private String url;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 水平层级
     */
    private Long level;

    /**
     * 状态  0 禁用 1 启用
     */
    private Integer status;

    /**
     * 菜单类型0目录 1菜单 2按钮
     */
    private Integer type;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标记0失效  1有效
     */
    private Integer deleted;


}
