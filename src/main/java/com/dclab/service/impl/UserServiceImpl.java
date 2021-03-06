package com.dclab.service.impl;

import com.dclab.entity.Admin;
import com.dclab.mapper.AdminMapper;
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
	private AdminMapper adminMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

	@Override
	public int registerAdmin(Admin admin) {
		return adminMapper.insertSelective(admin);
	}

	@Override
	public Admin checkAdmin(Admin admin) {
		Admin realAdmin = adminMapper.findByAdminName(admin.getAdminname());
		if (realAdmin!=null && admin.getPassword().equals(realAdmin.getPassword()))
			return realAdmin;
		return null;
	}

	@Override
	public Admin getAdmin(String adminname) {
		return adminMapper.findByAdminName(adminname);
	}
}
