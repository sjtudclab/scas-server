package com.dclab.controller;

import com.dclab.entity.*;
import com.dclab.entity.request.BuildingIdBody;
import com.dclab.entity.request.CommIdBody;
import com.dclab.entity.request.NeigIdBody;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.CommunityCreateService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCLab on 11/27/2015.
 */
@Controller
@Api(value = "社区创建模块", description = "社区创建模块")
@RequestMapping(value = "/community")
public class CommunityCreateController {
    @Autowired
    private CommunityCreateService communityCreateService;

//    @ApiOperation(value = "添加社区信息", notes = "添加社区信息")
//    @ResponseBody
//    @RequestMapping(value = "/community/add", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8")
//    public ResponseResult<Community> addCommunity(@RequestBody Community community) {
//        communityCreateService.saveNewCommunity(community);
//        Community foundCommunity = communityCreateService.getCommunity(community.getCommName());
//        if (foundCommunity != null){
//            ArrayList<Community> data = new ArrayList<Community>();
//            data.add(foundCommunity);
//            return new ResponseResult<Community>(data);
//        } else {
//            return new ResponseResult<Community>(1, "添加社区失败");
//        }
//    }

    @ApiOperation(value = "添加小区信息", notes = "添加小区信息")
    @ResponseBody
    @RequestMapping(value = "/neighbourhood/add", method = RequestMethod.POST)
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

    @ApiOperation(value = "添加楼栋信息", notes = "添加楼栋信息")
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

    @ApiOperation(value = "添加户信息", notes = "添加户信息")
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

    @ApiOperation(value = "添加周边设施信息", notes = "添加周边设施信息")
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

    @ApiOperation(value = "添加周边商户信息", notes = "添加周边商户信息")
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

    @ApiOperation(value = "获取指定社区的小区列表", notes = "获取指定社区的小区列表")
    @ResponseBody
    @RequestMapping(value = "/neighbourhoods", method = RequestMethod.POST)
    public ResponseResult<Neighbourhood> getNeighbourhoodsByCommId(@RequestBody CommIdBody body){
        List<Neighbourhood> data = communityCreateService.getNeighbourhoodsByCommId(body.getCommId());
        return new ResponseResult<Neighbourhood>(data);
    }

    @ApiOperation(value = "获取指定小区的楼栋列表", notes = "获取指定小区的楼栋列表")
    @ResponseBody
    @RequestMapping(value = "/buildings", method = RequestMethod.POST)
    public ResponseResult<Building> getBuildingsByNeigId(@RequestBody NeigIdBody body){
        List<Building> data = communityCreateService.getBuildingsByNeigId(body.getNeigId());
        return new ResponseResult<Building>(data);
    }

    @ApiOperation(value = "获取指定楼栋的户列表", notes = "获取指定楼栋的户列表")
    @ResponseBody
    @RequestMapping(value = "/apartments", method = RequestMethod.POST)
    public ResponseResult<Apartment> getApartmentsByBuildingId(@RequestBody BuildingIdBody body){
        List<Apartment> data = communityCreateService.getApartmentsByBuildingId(body.getBuildingId());
        return new ResponseResult<Apartment>(data);
    }

    @ApiOperation(value = "获取周边商户列表", notes = "获取周边商户列表")
    @ResponseBody
    @RequestMapping(value = "/merchants", method = RequestMethod.POST)
    public ResponseResult<Merchant> getMerchants(){
        List<Merchant> data = communityCreateService.getMerchants();
        return new ResponseResult<Merchant>(data);
    }

    @ApiOperation(value = "获取周边设施列表", notes = "获取周边设施列表")
    @ResponseBody
    @RequestMapping(value = "/devices", method = RequestMethod.POST)
    public ResponseResult<Device> getDevices(){
        List<Device> data = communityCreateService.getDevices();
        return new ResponseResult<Device>(data);
    }

}
