package com.dclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Huiyi on 2015/3/26.
 */
@Controller
@RequestMapping({ "/", "/signin" })
public class SigninController {

    @RequestMapping(method = RequestMethod.GET)
    public String signin(HttpServletRequest request) {
//        request.getSession().setAttribute("name", "li");
        return "signin";
    }
}
