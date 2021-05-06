package com.ivymon.inventory.constant;

public enum RtnConst {
    SUCCESS("0000","成功"),
    UNKNOWN_FAIL("9999", "系統錯誤");


    RtnConst(String rtnCode, String rtnMsg){
        this.rtnCode = rtnCode;
        this.rtnMsg = rtnMsg;
    }
    private String rtnCode;
    private String rtnMsg;

    public String getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(String rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }
}
