package com.ivymon.inventory.util;

import org.apache.tomcat.util.buf.HexUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    /**
     * SHA256 加密
     *
     * @param target 加密前的原字串
     * @return sha256結果
     * @throws NoSuchAlgorithmException
     */
    public static String sha256(String target) throws NoSuchAlgorithmException {
        return HexUtils.toHexString(MessageDigest.getInstance("SHA-256")
                .digest(target.getBytes()));
    }
}
