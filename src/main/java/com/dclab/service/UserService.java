package com.dclab.service;

import com.dclab.entity.Admin;
import com.dclab.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *2015年1月19日 下午9:43:23
 *@author changyi yuan
 */
public interface UserService extends UserDetailsService{
    public int registerAdmin(Admin admin);
    public Admin checkAdmin(Admin admin);
}
