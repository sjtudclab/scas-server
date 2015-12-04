package com.dclab.controller;

import com.dclab.entity.Admin;
import com.dclab.entity.response.ResponseResult;
import com.dclab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by DCLab on 12/2/2015.
 */
@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String signin() {
        return "signin";
    }

    @ResponseBody
    @RequestMapping(value = "/signin", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult login(@RequestBody Admin admin) {
        Admin realAdmin = userService.checkAdmin(admin);
        if (realAdmin != null) {
            return new ResponseResult();
        } else {
            return new ResponseResult(1, "登录失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult<Admin> register(@RequestBody Admin admin) {
        userService.registerAdmin(admin);
        Admin foundAdmin = userService.getAdmin(admin.getAdminname());
        if (foundAdmin != null){
            ArrayList<Admin> data = new ArrayList<Admin>();
            data.add(foundAdmin);
            return new ResponseResult<Admin>(data);
        }else {
            return new ResponseResult<Admin>(1, "注册失败");
        }
    }


}
