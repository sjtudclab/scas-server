package com.dclab.controller;

import com.dclab.entity.MonitorStatus;
import com.dclab.entity.request.CommIdBody;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.MonitorService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kaiyang Lv on 12/4/15.
 */
@Controller
@Api(value = "状态监控模块", description = "状态监控模块")
@RequestMapping(value = "/monitor")
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @ApiOperation(value = "移动端用户状态", notes = "移动端用户状态")
    @RequestMapping(value = "/mobile/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<MonitorStatus> getMonitorInfo(@RequestBody CommIdBody body) {
        return new ResponseResult<MonitorStatus>(monitorService.getMonitorInfo(body.getCommId()));
    }

//    @RequestMapping(value = "/mobile/user/monitor", method = RequestMethod.POST)
//    @ResponseBody
//    public List<MonitorStatus> getMonitorInfo(int communityId) {
//        return monitorService.getMonitorInfo(communityId);
//    }
}
