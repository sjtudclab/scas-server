package com.dclab.controller;

import com.dclab.common.Result;
import com.dclab.entity.User;
import com.dclab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by DCLab on 11/26/2015.
 */
@Controller
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String signup() {
        return "signup";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String register(@RequestBody User user) {
        userService.registerUser(user);
        return Result.SUCCESS;
    }
}
