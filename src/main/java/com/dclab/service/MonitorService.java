package com.dclab.service;

import com.dclab.entity.MonitorStatus;

import java.util.Collection;

/**
 * Created by hadoop on 12/4/15.
 */
public interface MonitorService {
    Collection<MonitorStatus> getMonitorInfo(int communityId);
}
