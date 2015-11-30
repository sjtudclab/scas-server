package com.dclab.mapper;

import com.dclab.entity.Admin;

public interface AdminMapper {
    Admin findByAdminName(String adminName);

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}