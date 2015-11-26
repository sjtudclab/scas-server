package com.dclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by DCLab on 11/26/2015.
 */
@Controller
@RequestMapping("/signup")
public class SignupController {

    @RequestMapping(method = RequestMethod.GET)
    public String signup() {
        return "signup";
    }
}
