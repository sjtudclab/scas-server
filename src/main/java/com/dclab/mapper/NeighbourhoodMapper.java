package com.dclab.mapper;

import com.dclab.entity.Neighbourhood;

import java.util.List;

public interface NeighbourhoodMapper {
    int deleteByPrimaryKey(Integer neigId);

    int insert(Neighbourhood record);

    int insertSelective(Neighbourhood record);

    Neighbourhood selectByPrimaryKey(Integer neigId);

    int updateByPrimaryKeySelective(Neighbourhood record);

    int updateByPrimaryKey(Neighbourhood record);

    List<Neighbourhood> getNeighbourhoodsByCommId(Integer commId);
}