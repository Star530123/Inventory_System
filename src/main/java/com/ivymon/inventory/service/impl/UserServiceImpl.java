package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.User;
import com.ivymon.inventory.entity.mapper.UserMapper;
import com.ivymon.inventory.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(String account){

        return userMapper.selectByPrimaryKey(account);
    }

    @Override
    public String createUser(User request){
        User user = new User();
        user.setAccount(request.getAccount());
        user.setPassword(request.getPassword());
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setLastLoginTime(request.getLastLoginTime());
        user.setCreatTime(request.getCreatTime());
        user.setUserGroup(request.getUserGroup());
        userMapper.insertSelective(user);
        return "successful";
    }
    @Override
    public  String updateUser(User request){
        userMapper.updateByPrimaryKeySelective(request);
        return "successful";
    }

    @Override
    public String deleteUser(String account){
        userMapper.deleteByPrimaryKey(account);
        return "successful";
    }

    @Override
    public User researchUser(String account){


        return userMapper.selectByPrimaryKey(account);

    }

}
