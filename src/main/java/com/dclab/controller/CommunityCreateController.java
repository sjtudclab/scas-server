package com.dclab.controller;

import com.dclab.entity.Community;
import com.dclab.entity.Neighbourhood;
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
        map.addAttribute("community", new Community());
        map.addAttribute("neighbourhood", new Neighbourhood());
        return "community_info";
    }
    @RequestMapping(value = "/create/community", method = RequestMethod.POST)
    public String doCreateCommunityBasic(Community community, ModelMap map) {
        int result = communityCreateService.saveNewCommunity(community);
        map.addAttribute("community", community);
        map.addAttribute("neighbourhood", new Neighbourhood());
        return "community_info";
    }

    @RequestMapping(value = "/create/small_community", method = RequestMethod.GET)
    public String addSmallCommunity(ModelMap map) {
        map.addAttribute("neighbourhood", new Neighbourhood(1));
        return "small_comm_add";
    }
    @RequestMapping(value = "/create/small_community", method = RequestMethod.POST)
    public String doAddSmallCommunity(Neighbourhood neighbourhood, ModelMap map) {
        int result = communityCreateService.saveNewNeighbourhood(neighbourhood);
        map.addAttribute("neighbourhood", neighbourhood);
        map.addAttribute("community", new Community());
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
