package com.dclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Huiyi on 2015/3/26.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {
        request.getSession().setAttribute("name", "li");
        return "success";
    }
}
