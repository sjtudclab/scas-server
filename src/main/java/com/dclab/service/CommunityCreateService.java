package com.dclab.service;

import com.dclab.entity.Community;
import com.dclab.entity.Neighbourhood;

/**
 * Created by DCLab on 11/29/2015.
 */
public interface CommunityCreateService {
    int saveNewCommunity(Community community);

    int saveNewNeighbourhood(Neighbourhood neighbourhood);
}
