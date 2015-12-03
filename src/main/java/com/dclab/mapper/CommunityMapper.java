package com.dclab.mapper;

import com.dclab.entity.Community;

public interface CommunityMapper {
    int deleteByPrimaryKey(Integer commId);

    int insert(Community record);

    int insertSelective(Community record);

    Community selectByPrimaryKey(Integer commId);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    Community findCommunityByName(String commName);
}