package com.dclab.controller;

import com.dclab.entity.GBXZQH;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.MetaDataService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DCLab on 12/4/2015.
 */
@Controller
@Api(value = "元数据模块", description = "元数据模块")
@RequestMapping(value = "/metadata")
public class MetaDataController {
    @Autowired
    private MetaDataService metaDataService;

    @ApiOperation(value = "行政区划码转换", notes = "行政区划码转换")
    @ResponseBody
    @RequestMapping(value = "/gbxzqh", method = RequestMethod.POST)
    public ResponseResult<GBXZQH> getGBXZQHs(){
        List<GBXZQH> data = metaDataService.getGBXZQHs();
        return new ResponseResult<GBXZQH>(data);
    }
}
