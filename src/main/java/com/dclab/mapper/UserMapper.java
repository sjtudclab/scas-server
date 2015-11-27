package com.dclab.mapper;


import com.dclab.entity.User;

/**
 * Created by Huiyi on 2015/3/11.
 */
public interface UserMapper {

    public User findByUserName(String username);
    public Boolean save(User user);
}
