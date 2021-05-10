package com.ivymon.inventory.model;

import com.ivymon.inventory.constant.Const;
import com.ivymon.inventory.constant.RtnConst;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

@ApiModel
public class Response<T> {
    @Schema(description = "回傳訊息編號")
    private String rtnCode;
    @Schema(description = "回傳訊息")
    private String rtnMsg;
    private T result;

    public Response() {
    }

    public Response(T result){
        this.rtnCode = RtnConst.SUCCESS.getRtnCode();
        this.rtnMsg = RtnConst.SUCCESS.getRtnMsg();
        this.result = result;
    }

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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
