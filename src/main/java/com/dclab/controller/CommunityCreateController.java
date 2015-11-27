package com.dclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DCLab on 11/27/2015.
 */
@Controller
public class CommunityCreateController {

    @RequestMapping(value = "/create/community", method = RequestMethod.GET)
    public String createCommunityBasic() {
//		model.addAttribute("message", "Hello world!");
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
