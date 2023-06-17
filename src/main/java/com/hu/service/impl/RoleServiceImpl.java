package com.hu.service.impl;

import com.hu.domain.PageBean;
import com.hu.domain.Role;
import com.hu.mapper.RoleMapper;
import com.hu.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Husp
 * @since 2023-06-17
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    /**
     * 查询所有角色
     * @param pageBean
     * @param role
     * @return
     */
    @Override
    public PageBean<Role> list(PageBean<Role> pageBean, Role role) {
        //1.获得当前页参数
        Integer currentPage = pageBean.getCurrentPage();
        //上一页按钮不能超过1
        if (currentPage < 1){
            currentPage = 1;
        }
        //2.获得每页显示几条记录
        Integer pageSizes = pageBean.getPageSizes();
        PageBean<Role> pb = new PageBean<>();
        pb.setCurrentPage(currentPage);
        pb.setPageSizes(pageSizes);

        //3.查询总条数
        Integer totalCount= roleMapper.findTotalCount();
        pb.setTotalCount(totalCount);

        //5.查询总页码
        Integer totalPage = (totalCount % pageSizes) == 0? (totalCount / pageSizes) :(totalCount / pageSizes)+1;
        pb.setTotalPage(totalPage);
        //下一页按钮不超过最大页码
        if (currentPage >= totalPage){
            currentPage = totalPage;
            pb.setCurrentPage(currentPage);
        }

        //4.查询每页显示的数据
        Integer start = (currentPage - 1) * pageSizes;
        List<Role> roleList = roleMapper.list(start, pageSizes);
        pb.setRecords(roleList);
        return pb;
    }
}
