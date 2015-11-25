package com.dclab.entity;


import com.dclab.mapper.User;

/**
 * Created by Huiyi on 2015/3/11.
 */
public interface UserMapper {

    public User findByUserName(String username);
}
