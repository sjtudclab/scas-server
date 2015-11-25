package com.dclab.util;

import cn.edu.sjtu.se.dclab.auth.thrift.AuthClient;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

public class VerifyDeviceUtil {
	private static String token = null;
	public static String getToken() {
		return token;
	}
	public static boolean verifyDevice(Map<String, Object> map) {
		AuthClient client = AuthClient.getInstance();

		if (map.containsKey("token")) {
			String _token = (String) map.get("token");
			token = _token;
			return verifyTokenInSession(_token);
		} else {
			String publicKey = (String) map.get("publicKey");
			String encrypedString = (String) map.get("encryptedString");
			String originalString = (String) map.get("orignalString");
			
			String ret = client.verifyDevice(publicKey, encrypedString, originalString);
			if (ret == null || ret.length() == 0 || ret.equals("false")) {
				token = null;
				return false;
			} else {
				token = ret;
				setTokenInSession(token);
				return true;
			}
		}
	}
	

	public static boolean verifyTokenInSession(String token) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		HttpSession session = request.getSession();
		String serverToken = (String) session.getAttribute("deviceTokenKey");
		if (serverToken == null) {
			return false;
		}
		
		return token.equals(serverToken);
	}

	public static void setTokenInSession(String token) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		HttpSession session = request.getSession();
		session.setAttribute("deviceTokenKey", token);
	}

}
