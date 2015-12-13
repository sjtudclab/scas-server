package com.dclab.controller;

import com.dclab.entity.CitizenResident;
import com.dclab.entity.Device;
import com.dclab.entity.Neighbourhood;
import com.dclab.entity.User;
import com.dclab.entity.request.CommIdBody;
import com.dclab.entity.request.CommIdNeigIdBody;
import com.dclab.entity.request.CommIdNeigIdBuildingIdBody;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.PeopleService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DCLab on 12/13/2015.
 */
@Controller
@Api(value = "人员信息模块", description = "人员信息模块")
@RequestMapping(value = "/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @ApiOperation(value = "添加居民信息", notes = "添加居民信息")
    @ResponseBody
    @RequestMapping(value = "/resident/add", method = RequestMethod.POST)
    public ResponseResult<CitizenResident> addNeighbourhood(@RequestBody CitizenResident resident) {
        peopleService.saveNewResident(resident);
        CitizenResident foundCitizenResident = peopleService.getCitizenResident(resident.getIdentificationValue());
        if (foundCitizenResident != null){
            ArrayList<CitizenResident> data = new ArrayList<CitizenResident>();
            data.add(foundCitizenResident);
            return new ResponseResult<CitizenResident>(data);
        } else {
            return new ResponseResult<CitizenResident>(1, "添加居民失败");
        }
    }

    @ApiOperation(value = "获取指定社区的居民列表", notes = "获取指定社区的居民列表")
    @ResponseBody
    @RequestMapping(value = "/residents/community", method = RequestMethod.POST)
    public ResponseResult<CitizenResident> getCitizenResidentsInCommunity(@RequestBody CommIdBody body){
        List<CitizenResident> data = peopleService.getCitizenResidents(body.getCommId());
        return new ResponseResult<CitizenResident>(data);
    }

    @ApiOperation(value = "获取指定社区、小区的居民列表", notes = "获取指定社区、小区的居民列表")
    @ResponseBody
    @RequestMapping(value = "/residents/neighbour", method = RequestMethod.POST)
    public ResponseResult<CitizenResident> getCitizenResidentsInNeighbour(@RequestBody CommIdNeigIdBody body){
        List<CitizenResident> data = peopleService.getCitizenResidents(body.getCommId(), body.getNeighbourId());
        return new ResponseResult<CitizenResident>(data);
    }

    @ApiOperation(value = "获取指定社区、小区、楼栋的居民列表", notes = "获取指定社区、小区、楼栋的居民列表")
    @ResponseBody
    @RequestMapping(value = "/residents/building", method = RequestMethod.POST)
    public ResponseResult<CitizenResident> getCitizenResidentsInBuilding(@RequestBody CommIdNeigIdBuildingIdBody body){
        List<CitizenResident> data = peopleService.getCitizenResidents(body.getCommId(), body.getNeighbourId(),
                body.getBuildingId());
        return new ResponseResult<CitizenResident>(data);
    }

}
