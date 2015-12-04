package com.dclab.util;

import com.dclab.entity.TheUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *2014年12月27日 上午9:59:47
 *@author changyi yuan
 */
public class SecurityContextUtils {
	public final static TheUser getUser(){
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails)
			return (TheUser)principal;
		return null;
	}
	
	public final static long getUserId(){
		TheUser user = getUser();
		return user.getId();
	}
	
	public static boolean verifyUser(int userId){
		return userId == getUserId();
	}
}
