package com.dclab.service.impl;

import com.dclab.entity.Community;
import com.dclab.mapper.CommunityMapper;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by DCLab on 11/29/2015.
 */
@Service
public class CommunityCreateServiceImpl implements CommunityCreateService {
    @Autowired
    private CommunityMapper communityMapper;

    @Override
    public int saveNewCommunity(Community community) {
        return communityMapper.insertSelective(community);
    }
}
