package com.dclab.service.impl;

import com.dclab.entity.User;
import com.dclab.mapper.UserMapper;
import com.dclab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 2015年1月19日 下午9:44:00
 *
 * @author changyi yuan
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

	@Override
	public Boolean registerUser(User user) {
		return userMapper.save(user);
	}

	@Override
	public User checkUser(User user){
		User u = userMapper.findByUserName(user.getUsername());
		if (u!=null && user.getPassword().equals(u.getPassword()))
			return u;
		return null;
	}
}
