package com.ivymon.inventory.service;


import com.ivymon.inventory.model.request.LoginReq;
import com.ivymon.inventory.model.request.NewUserReq;
import com.ivymon.inventory.model.response.LoginRes;
import com.ivymon.inventory.model.response.NewUserRes;

public interface IUserService {
    public NewUserRes newUser(NewUserReq newUserReq);

    public LoginRes login(LoginReq loginReq);

}

