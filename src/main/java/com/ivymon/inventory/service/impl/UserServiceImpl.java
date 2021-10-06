package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.constant.RtnConst;
import com.ivymon.inventory.entity.User;
import com.ivymon.inventory.entity.mapper.UserMapper;
import com.ivymon.inventory.model.InventoryException;
import com.ivymon.inventory.model.request.NewUserReq;
import com.ivymon.inventory.model.response.NewUserRes;
import com.ivymon.inventory.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public NewUserRes newUser(NewUserReq newUserReq) {

        String ptAccount = "[a-zA-Z]+[0-9]+|[0-9]+[a-zA-Z]+";
        String ptPassword = "[a-zA-Z]+[0-9]+|[0-9]+[a-zA-Z]+";
        String ptEmail = "[a-zA-Z0-9._]+@([a-zA-Z0-9_]+.[a-zA-Z0-9_]+)+";
        User user = new User();
        if (newUserReq.getUserGroup().isEmpty()) {
            user.setUserGroup("general");
        }
        else {
            user.setUserGroup(newUserReq.getUserGroup());
        }
        String account = newUserReq.getAccount();
        if (account.matches(ptAccount)) {
            user.setAccount(account);
        }else {
            throw new InventoryException(RtnConst.REQ_USER_ACCOUNT_ERROR);
        }
        String password = newUserReq.getPassword();
        if (password.matches(ptPassword)) {
            user.setPassword(password);
        }else {
            throw new InventoryException(RtnConst.REQ_USER_PASSWORD_ERROR);
        }
        String email = newUserReq.getEmail();
        if (email.matches(ptEmail)) {
            user.setEmail(email);
        }else {
            throw new InventoryException(RtnConst.REQ_USER_EMAIL_ERROR);
        }
        user.setUsername(newUserReq.getUserName());
        user.setCreatTime(new Date());
        userMapper.insertSelective(user);
        return new NewUserRes(true);
    }

}
