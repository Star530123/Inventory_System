package com.ivymon.inventory.constant;

public enum RtnConst {
    SUCCESS("0000","成功"),
    REQ_ACCOUNT_ERROR("1001","req account不等於A"),
    REQ_USER_ACCOUNT_ERROR("1002","創建使用者帳號輸入錯誤"),
    REQ_USER_PASSWORD_ERROR("1002","創建使用者密碼輸入錯誤"),
    REQ_USER_EMAIL_ERROR("1002","創建使用者電子信箱輸入錯誤"),
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
