package com.dclab.mapper;

import com.dclab.entity.Device;

import java.util.List;

public interface DeviceMapper {
    int deleteByPrimaryKey(String deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    Device selectByPrimaryKey(String deviceId);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);

    Device findDevice(String macAddress);
    Device findDeviceExact(String deviceId, Integer merchantId, String macAddress);

    List<Device> getDevices();
}