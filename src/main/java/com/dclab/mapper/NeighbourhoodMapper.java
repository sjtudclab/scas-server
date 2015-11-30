package com.dclab.mapper;

import com.dclab.entity.Neighbourhood;

public interface NeighbourhoodMapper {
    int deleteByPrimaryKey(Integer neigId);

    int insert(Neighbourhood record);

    int insertSelective(Neighbourhood record);

    Neighbourhood selectByPrimaryKey(Integer neigId);

    int updateByPrimaryKeySelective(Neighbourhood record);

    int updateByPrimaryKey(Neighbourhood record);
}