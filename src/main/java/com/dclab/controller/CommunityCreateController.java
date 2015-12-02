package com.dclab.controller;

import com.dclab.entity.Community;
import com.dclab.entity.Neighbourhood;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by DCLab on 11/27/2015.
 */
@Controller
public class CommunityCreateController {
    @Autowired
    private CommunityCreateService communityCreateService;

    @RequestMapping(value = "/create/small_community", method = RequestMethod.POST)
    public String doAddSmallCommunity(Neighbourhood neighbourhood) {
        int result = communityCreateService.saveNewNeighbourhood(neighbourhood);
        return "community_info";
    }

}
