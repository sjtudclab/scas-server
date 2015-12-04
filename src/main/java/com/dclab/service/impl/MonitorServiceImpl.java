package com.dclab.service.impl;

import cn.edu.sjtu.se.dclab.oss.dubbo.OnlineStatusQueryService;
import com.dclab.entity.MonitorStatus;
import com.dclab.entity.User;
import com.dclab.mapper.UserMapper;
import com.dclab.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by hadoop on 12/4/15.
 */
@Service
public class MonitorServiceImpl implements MonitorService{
    private OnlineStatusQueryService service;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<MonitorStatus> getMonitorInfo(int communityId){
        String configLocation="dubbo-consumer.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        service = (OnlineStatusQueryService)context.getBean("onlineStatusService");
        List<User> users = userMapper.selectByCommunityId(communityId);
        List<MonitorStatus> result = new ArrayList<MonitorStatus>();
        for (User u: users) {
            if (!service.checkOnline(u.getUserId().toString()).equals("[]")) {
                MonitorStatus ms= new MonitorStatus();
                ms.setStatus(true);
                ms.setUserId(u.getUserId().toString());
                ms.setUserName(u.getUsername());
                result.add(ms);

            }
        }
        return result;
    }
}
