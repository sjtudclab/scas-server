package com.dclab.mapper;

import com.dclab.entity.Apartment;

public interface ApartmentMapper {
    int deleteByPrimaryKey(Integer apartmentId);

    int insert(Apartment record);

    int insertSelective(Apartment record);

    Apartment selectByPrimaryKey(Integer apartmentId);

    int updateByPrimaryKeySelective(Apartment record);

    int updateByPrimaryKey(Apartment record);

    Apartment findApartment(Integer ownerId, Integer buildingId);
}