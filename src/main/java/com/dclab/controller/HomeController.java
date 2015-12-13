package com.dclab.controller;

import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {

    @ApiOperation(value = "首页：登录页面", notes = "首页：登录页面")
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "signin";
    }

}