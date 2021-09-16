package com.ivymon.inventory.service;


import com.ivymon.inventory.entity.User;

public interface IUserService {
    public User getUser(String account);

    public String createUser(User request);

    public  String updateUser(User request);

    public String deleteUser(String account);

    public User researchUser(String account);


}

