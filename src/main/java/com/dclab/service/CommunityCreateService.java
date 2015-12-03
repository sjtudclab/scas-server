package com.dclab.service;

import com.dclab.entity.*;

import java.util.List;

/**
 * Created by DCLab on 11/29/2015.
 */
public interface CommunityCreateService {
    int saveNewCommunity(Community community);
    Community getCommunity(int id);
    Community getCommunity(String commName);

    int saveNewNeighbourhood(Neighbourhood neighbourhood);
    List<Neighbourhood> getNeighbourhoodsByCommId(Integer commId);
    Neighbourhood getNeighbourhood(String neigName, String neigAddress);

    int saveNewBuilding(Building building);
    Building getBuilding(String name, Integer neigId);

    int saveNewApartment(Apartment apartment);
    Apartment getApartment(Integer ownerId, Integer buildingId);

    int saveNewDevice(Device device);
    Device getDevice(String macAddress);
    Device getDevice(String deviceId, Integer merchantId, String macAddress);

    int saveNewMerchant(Merchant merchant);
    Merchant getMerchant(String merchantName, String address);
}
