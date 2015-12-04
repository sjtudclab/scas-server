package com.dclab.controller;

import com.dclab.entity.*;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by DCLab on 11/27/2015.
 */
@Controller
public class CommunityCreateController {
    @Autowired
    private CommunityCreateService communityCreateService;

    @ResponseBody
    @RequestMapping(value = "/community/add", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
    public ResponseResult<Community> addCommunity(@RequestBody Community community) {
        communityCreateService.saveNewCommunity(community);
        Community foundCommunity = communityCreateService.getCommunity(community.getCommName());
        if (foundCommunity != null){
            ArrayList<Community> data = new ArrayList<Community>();
            data.add(foundCommunity);
            return new ResponseResult<Community>(data);
        } else {
            return new ResponseResult<Community>(1, "添加社区失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/neghbourhood/add", method = RequestMethod.POST)
    public ResponseResult<Neighbourhood> addNeighbourhood(@RequestBody Neighbourhood neighbourhood) {
        communityCreateService.saveNewNeighbourhood(neighbourhood);
        Neighbourhood foundNeighbourhood = communityCreateService.
                getNeighbourhood(neighbourhood.getNeigName(), neighbourhood.getNeigAddress());
        if (foundNeighbourhood != null){
            ArrayList<Neighbourhood> data = new ArrayList<Neighbourhood>();
            data.add(foundNeighbourhood);
            return new ResponseResult<Neighbourhood>(data);
        } else {
            return new ResponseResult<Neighbourhood>(1, "添加小区失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/building/add", method = RequestMethod.POST)
    public ResponseResult<Building> addBuilding(@RequestBody Building building) {
        communityCreateService.saveNewBuilding(building);
        Building foundBuilding = communityCreateService.
                getBuilding(building.getName(), building.getNeigId());
        if (foundBuilding != null){
            ArrayList<Building> data = new ArrayList<Building>();
            data.add(foundBuilding);
            return new ResponseResult<Building>(data);
        } else {
            return new ResponseResult<Building>(1, "添加楼栋失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/apartment/add", method = RequestMethod.POST)
    public ResponseResult<Apartment> addApartment(@RequestBody Apartment apartment) {
        communityCreateService.saveNewApartment(apartment);
        Apartment foundApartment = communityCreateService.
                getApartment(apartment.getOwnerId(), apartment.getBuildingId());
        if (foundApartment != null){
            ArrayList<Apartment> data = new ArrayList<Apartment>();
            data.add(foundApartment);
            return new ResponseResult<Apartment>(data);
        } else {
            return new ResponseResult<Apartment>(1, "添加户失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/device/add", method = RequestMethod.POST)
    public ResponseResult<Device> addDevice(@RequestBody Device device) {
        communityCreateService.saveNewDevice(device);
        Device foundDevice = communityCreateService.
                getDevice(device.getDeviceId(), device.getMerchantId(), device.getMacAddress());
        if (foundDevice != null){
            ArrayList<Device> data = new ArrayList<Device>();
            data.add(foundDevice);
            return new ResponseResult<Device>(data);
        } else {
            return new ResponseResult<Device>(1, "添加周边设施失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/merchant/add", method = RequestMethod.POST)
    public ResponseResult<Merchant> addDevice(@RequestBody Merchant merchant) {
        communityCreateService.saveNewMerchant(merchant);
        Merchant foundMerchant = communityCreateService.
                getMerchant(merchant.getMerchantName(), merchant.getAddress());
        if (foundMerchant != null){
            ArrayList<Merchant> data = new ArrayList<Merchant>();
            data.add(foundMerchant);
            return new ResponseResult<Merchant>(data);
        } else {
            return new ResponseResult<Merchant>(1, "添加周边商户失败");
        }
    }

}
