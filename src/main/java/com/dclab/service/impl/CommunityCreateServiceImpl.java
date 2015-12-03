package com.dclab.service.impl;

import com.dclab.entity.*;
import com.dclab.mapper.*;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DCLab on 11/29/2015.
 */
@Service
public class CommunityCreateServiceImpl implements CommunityCreateService {
    @Autowired
    private CommunityMapper communityMapper;
    @Autowired
    private NeighbourhoodMapper neighbourhoodMapper;
    @Autowired
    private BuildingMapper buildingMapper;
    @Autowired
    private ApartmentMapper apartmentMapper;
    @Autowired
    private DeviceMapper deviceMapper;
    @Autowired
    private MerchantMapper merchantMapper;


    @Override
    public int saveNewCommunity(Community community) {
        return communityMapper.insertSelective(community);
    }

    @Override
    public int saveNewNeighbourhood(Neighbourhood neighbourhood) {
        return neighbourhoodMapper.insertSelective(neighbourhood);
    }

    @Override
    public Community getCommunity(int id) {
        return communityMapper.selectByPrimaryKey(id);
    }

    @Override
    public Community getCommunity(String commName) {
        return communityMapper.findCommunityByName(commName);
    }

    @Override
    public List<Neighbourhood> getNeighbourhoodsByCommId(Integer commId) {
        return neighbourhoodMapper.getNeighbourhoodsByCommId(commId);
    }

    @Override
    public Neighbourhood getNeighbourhood(String neigName, String neigAddress) {
        return neighbourhoodMapper.getNeighbourhood(neigName, neigAddress);
    }

    @Override
    public int saveNewBuilding(Building building) {
        return buildingMapper.insertSelective(building);
    }

    @Override
    public Building getBuilding(String name, Integer neigId) {
        return buildingMapper.findBuilding(name, neigId);
    }

    @Override
    public int saveNewApartment(Apartment apartment) {
        return apartmentMapper.insertSelective(apartment);
    }

    @Override
    public Apartment getApartment(Integer ownerId, Integer buildingId) {
        return apartmentMapper.findApartment(ownerId, buildingId);
    }

    @Override
    public int saveNewDevice(Device device) {
        return deviceMapper.insertSelective(device);
    }

    @Override
    public Device getDevice(String macAddress) {
        return deviceMapper.findDevice(macAddress);
    }

    @Override
    public Device getDevice(String deviceId, Integer merchantId, String macAddress) {
        return deviceMapper.findDeviceExact(deviceId, merchantId, macAddress);
    }

    @Override
    public int saveNewMerchant(Merchant merchant) {
        return merchantMapper.insertSelective(merchant);
    }

    @Override
    public Merchant getMerchant(String merchantName, String address) {
        return merchantMapper.findMerchant(merchantName, address);
    }
}
