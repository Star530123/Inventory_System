package com.ivymon.inventory.util;

import com.ivymon.inventory.constant.RtnConst;
import com.ivymon.inventory.model.InventoryException;
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
    public static String sha256(String target) {
        try {
            return HexUtils.toHexString(MessageDigest.getInstance("SHA-256")
                    .digest(target.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new InventoryException(RtnConst.UNKNOWN_FAIL);
        }
    }
}
