package com.dclab.controller;

import com.dclab.entity.MonitorStatus;
import com.dclab.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Kaiyang Lv on 12/4/15.
 */
@Controller
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @RequestMapping(value = "/mobile/user/monitor", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<MonitorStatus> getMonitorInfo(int communityId) {
        return monitorService.getMonitorInfo(communityId);


    }
}
