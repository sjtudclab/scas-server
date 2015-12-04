package com.dclab.mapper;

import com.dclab.entity.GBXZQH;

import java.util.List;

public interface GBXZQHMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GBXZQH record);

    int insertSelective(GBXZQH record);

    GBXZQH selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GBXZQH record);

    int updateByPrimaryKey(GBXZQH record);

    List<GBXZQH> getGBXZQHs();
}