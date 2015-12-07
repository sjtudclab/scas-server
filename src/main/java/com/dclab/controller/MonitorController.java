package com.dclab.controller;

import com.dclab.entity.MonitorStatus;
import com.dclab.entity.request.RequestMobileStatBody;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kaiyang Lv on 12/4/15.
 */
@Controller
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @RequestMapping(value = "/mobile/user/monitor", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<MonitorStatus> getMonitorInfo(@RequestBody RequestMobileStatBody body) {
        return new ResponseResult<MonitorStatus>(monitorService.getMonitorInfo(body.getCommId()));
    }

//    @RequestMapping(value = "/mobile/user/monitor", method = RequestMethod.POST)
//    @ResponseBody
//    public List<MonitorStatus> getMonitorInfo(int communityId) {
//        return monitorService.getMonitorInfo(communityId);
//    }
}
