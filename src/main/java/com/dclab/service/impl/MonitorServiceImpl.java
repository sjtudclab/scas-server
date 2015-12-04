package com.dclab.service.impl;

import cn.edu.sjtu.se.dclab.oss.dubbo.OnlineStatusQueryService;
import com.dclab.entity.MonitorStatus;
import com.dclab.service.MonitorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by hadoop on 12/4/15.
 */
@Service
public class MonitorServiceImpl implements MonitorService{
    private OnlineStatusQueryService service;

    @Override
    public Collection<MonitorStatus> getMonitorInfo(int communityId){
        String configLocation="dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        service = (OnlineStatusQueryService)context.getBean("onlineStatusService");
        System.out.println(service.checkOnline("1"));
        Collection<MonitorStatus> result = null;
        return result;
    }
}
