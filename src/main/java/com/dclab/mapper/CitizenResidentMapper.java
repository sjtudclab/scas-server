package com.dclab.mapper;

import com.dclab.entity.CitizenResident;

import java.util.List;

public interface CitizenResidentMapper {
    int deleteByPrimaryKey(Integer citizenId);

    int insert(CitizenResident record);

    int insertSelective(CitizenResident record);

    CitizenResident selectByPrimaryKey(Integer citizenId);

    int updateByPrimaryKeySelective(CitizenResident record);

    int updateByPrimaryKey(CitizenResident record);

    CitizenResident getCitizenResident(String identificationValue);
    List<CitizenResident> getCitizenResidentsInCommunity(Integer commId);
    List<CitizenResident> getCitizenResidentsInNeighbour(Integer commId, Integer neighbourId);
    List<CitizenResident> getCitizenResidentsInBuilding(Integer commId, Integer neighbourId, Integer buildingId);
}