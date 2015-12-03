package com.dclab.mapper;

import com.dclab.entity.Building;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer buildingId);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingId);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    Building findBuilding(String name, Integer neigId);
}