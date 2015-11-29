package com.dclab.controller;

import com.dclab.entity.Community;
import com.dclab.service.CommunityCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DCLab on 11/27/2015.
 */
@Controller
public class CommunityCreateController {
    @Autowired
    private CommunityCreateService communityCreateService;

    @RequestMapping(value = "/create/community", method = RequestMethod.GET)
    public String createCommunityBasic(ModelMap map) {
        map.addAttribute("community", new Community("test1", "test1"));
        return "community_info";
    }
    @RequestMapping(value = "/create/community", method = RequestMethod.POST)
    public String doCreateCommunityBasic(ModelMap map) {
        Community community = new Community("xx", "xx");
        int result = communityCreateService.saveNewCommunity(community);
        return "community_info";
    }

    @RequestMapping(value = "/edit/small_community", method = RequestMethod.GET)
    public String editSmallCommunity() {
        return "small_comm_info";
    }

    @RequestMapping(value = "/edit/building", method = RequestMethod.GET)
    public String editBuilding() {
        return "building_info";
    }

    @RequestMapping(value = "/create/people", method = RequestMethod.GET)
    public String createCommunityPeople() {
        return "people_info";
    }

    @RequestMapping(value = "/config/service", method = RequestMethod.GET)
    public String microServiceConfig() {
        return "micro_service_config";
    }
}
