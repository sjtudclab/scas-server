package com.dclab.service;

import com.dclab.entity.Admin;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *2015年1月19日 下午9:43:23
 *@author changyi yuan
 */
public interface UserService extends UserDetailsService{
    int registerAdmin(Admin admin);
    Admin checkAdmin(Admin admin);
    Admin getAdmin(String adminname);
}
