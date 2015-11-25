package com.dclab.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

/**
 *2015年4月2日 下午3:13:42
 *@author changyi yuan
 */
public class DataUtil {
	public static Map<String,Object> getFromJson(String jsonStr){
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String,Object> map = null;
		try{
			map = (HashMap<String,Object>) mapper.readValue(jsonStr,HashMap.class);
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
}
