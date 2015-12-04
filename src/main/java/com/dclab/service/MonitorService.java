package com.dclab.service;

import com.dclab.entity.MonitorStatus;

import java.util.Collection;
import java.util.List;

/**
 * Created by hadoop on 12/4/15.
 */
public interface MonitorService {
    List<MonitorStatus> getMonitorInfo(int communityId);
}
