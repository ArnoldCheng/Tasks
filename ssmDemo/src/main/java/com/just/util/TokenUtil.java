package com.just.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TokenUtil {

	private final Logger LOGGER = LogManager.getLogger(getClass());

	// 12小时后过期
	private final static int EXPIRE = 3600 * 12;

	public Map<String, Object> createToken(String str) {
		// 生成一个token
//		String token = UUID.randomUUID().toString();
		String key = "098f6bcd4621d373cade4e832627b4f62017121611345734";// 48个长度的字符串即可
		String token = MicroDES.encr(key, str);
		// 当前时间
		Date now = new Date();

		// 过期时间
		Date expireTime = new Date(now.getTime() + EXPIRE );
		LOGGER.info("过期时间：" + expireTime);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("token", token);
		map.put("expire", EXPIRE);

		LOGGER.info("map：" + map.toString());

		return map;
	}
}