package com.ivymon.inventory.model;

public class Request<T> {
    private String reqAccount;
    private String reqTime;
    private T body;

    public String getReqAccount() {
        return reqAccount;
    }

    public void setReqAccount(String reqAccount) {
        this.reqAccount = reqAccount;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
