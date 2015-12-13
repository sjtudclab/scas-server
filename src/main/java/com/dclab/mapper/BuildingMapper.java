package com.dclab.mapper;

import com.dclab.entity.Building;

import java.util.List;

public interface BuildingMapper {
    int deleteByPrimaryKey(Integer buildingId);

    int insert(Building record);

    int insertSelective(Building record);

    Building selectByPrimaryKey(Integer buildingId);

    int updateByPrimaryKeySelective(Building record);

    int updateByPrimaryKey(Building record);

    Building findBuilding(String name, Integer neigId);

    List<Building> getBuildingsByNeigId(Integer neigId);
}