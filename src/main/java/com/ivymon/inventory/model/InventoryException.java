package com.ivymon.inventory.model;

import com.ivymon.inventory.constant.RtnConst;

/**
 * @author Simon
 */
public class InventoryException extends RuntimeException{
    private final String code;
    private final String msg;

    public InventoryException(RtnConst rtnConst){
        super(String.format("%s : %s", rtnConst.getRtnCode(), rtnConst.getRtnMsg()));
        this.code = rtnConst.getRtnCode();
        this.msg = rtnConst.getRtnMsg();
    }

    public InventoryException(RtnConst rtnConst, String customMsg){
        super(String.format("%s : %s, %s", rtnConst.getRtnCode(), rtnConst.getRtnMsg(), customMsg));
        this.code = rtnConst.getRtnCode();
        this.msg = rtnConst.getRtnMsg();
    }

    public String getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
