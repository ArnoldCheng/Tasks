package com.just.util;

public class MicroDES {

    /**
     * 加密
     * 
     * @param key
     *            密钥
     * @param data
     *            业务参数
     * @return 加密后的业务参数
     */
    public static String encr(String key, String data) {
        try {
            byte[] srckey = MicroHexUtils.hex2byte(key);
            return MicroHexUtils.byte2hex(MicroDESedeUtils.encr(srckey, data.getBytes("UTF-8")));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 解密
     * 
     * @param key
     *            密钥
     * @param data
     *            业务参数
     * @return 解密后业务参数
     */
    public static String decr(String key, String data) {
        try {
            byte[] srckey = MicroHexUtils.hex2byte(key);
            return (new String(MicroDESedeUtils.decr(srckey, MicroHexUtils.hex2byte(data)), "UTF-8"));
        } catch (Exception e) {
            return null;
        }
    }

}