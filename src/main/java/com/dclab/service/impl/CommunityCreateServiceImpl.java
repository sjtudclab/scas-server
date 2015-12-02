package com.dclab.service.impl;

import com.dclab.entity.Community;
import com.dclab.entity.Neighbourhood;
import com.dclab.mapper.CommunityMapper;
import com.dclab.mapper.NeighbourhoodMapper;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DCLab on 11/29/2015.
 */
@Service
public class CommunityCreateServiceImpl implements CommunityCreateService {
    @Autowired
    private CommunityMapper communityMapper;
    @Autowired
    private NeighbourhoodMapper neighbourhoodMapper;


    @Override
    public int saveNewCommunity(Community community) {
        return communityMapper.insertSelective(community);
    }

    @Override
    public int saveNewNeighbourhood(Neighbourhood neighbourhood) {
        return neighbourhoodMapper.insertSelective(neighbourhood);
    }

    @Override
    public Community getCommunity(int id) {
        return communityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Neighbourhood> getNeighbourhoodsByCommId(Integer commId) {
        return neighbourhoodMapper.getNeighbourhoodsByCommId(commId);
    }
}
