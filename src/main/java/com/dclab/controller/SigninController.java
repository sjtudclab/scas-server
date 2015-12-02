package com.dclab.controller;

import com.dclab.common.Result;
import com.dclab.entity.Admin;
import com.dclab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huiyi on 2015/3/26.
 */
@Controller
@RequestMapping({ "/" })
public class SigninController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String signin() {
        return "signin";
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody Admin admin, Model model) {
        Admin a = userService.checkAdmin(admin);
        if (a != null) {
            model.addAttribute(admin);
            return Result.SUCCESS;
        } else {
            return "";
        }
    }
}
