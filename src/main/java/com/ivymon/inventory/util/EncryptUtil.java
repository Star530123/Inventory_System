package com.ivymon.inventory.util;

import org.apache.tomcat.util.buf.HexUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    /**
     * SHA256 加密
     * @param target
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String sha256(String target) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodeHash = digest.digest(target.getBytes());
        return new String(HexUtils.toHexString(encodeHash));
    }
}
