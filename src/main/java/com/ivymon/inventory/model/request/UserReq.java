package com.ivymon.inventory.model.request;

import java.util.Date;

public class UserReq {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ACCOUNT
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USERNAME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.EMAIL
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.CREAT_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.LAST_LOGIN_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_GROUP
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    private String userGroup;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ACCOUNT
     *
     * @return the value of user.ACCOUNT
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ACCOUNT
     *
     * @param account the value for user.ACCOUNT
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PASSWORD
     *
     * @return the value of user.PASSWORD
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PASSWORD
     *
     * @param password the value for user.PASSWORD
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USERNAME
     *
     * @return the value of user.USERNAME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USERNAME
     *
     * @param username the value for user.USERNAME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.EMAIL
     *
     * @return the value of user.EMAIL
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.EMAIL
     *
     * @param email the value for user.EMAIL
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.CREAT_TIME
     *
     * @return the value of user.CREAT_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.CREAT_TIME
     *
     * @param creatTime the value for user.CREAT_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.LAST_LOGIN_TIME
     *
     * @return the value of user.LAST_LOGIN_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.LAST_LOGIN_TIME
     *
     * @param lastLoginTime the value for user.LAST_LOGIN_TIME
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_GROUP
     *
     * @return the value of user.USER_GROUP
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_GROUP
     *
     * @param userGroup the value for user.USER_GROUP
     *
     * @mbg.generated Wed Sep 08 23:40:43 CST 2021
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }
}
