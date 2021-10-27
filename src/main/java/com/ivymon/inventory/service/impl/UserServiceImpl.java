package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.constant.RtnConst;
import com.ivymon.inventory.entity.User;
import com.ivymon.inventory.entity.mapper.UserMapper;
import com.ivymon.inventory.model.InventoryException;
import com.ivymon.inventory.model.request.LoginReq;
import com.ivymon.inventory.model.request.NewUserReq;
import com.ivymon.inventory.model.response.LoginRes;
import com.ivymon.inventory.model.response.NewUserRes;
import com.ivymon.inventory.service.IUserService;
import com.ivymon.inventory.util.EncryptUtil;
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
        //setUserGroup to user
        if (newUserReq.getUserGroup() == null) {
            user.setUserGroup("general");
        } else {
            user.setUserGroup(newUserReq.getUserGroup());
        }
        String account = newUserReq.getAccount();
        String password = newUserReq.getPassword();
        String email = newUserReq.getEmail();
        checkMethod(ptAccount, ptPassword, ptEmail, account, password, email);
        user.setEmail(email);
        String pwEncrypt = EncryptUtil.sha256(password);
        user.setPassword(pwEncrypt);
        user.setAccount(account);
        user.setUsername(newUserReq.getUserName());
        user.setCreatTime(new Date());

        userMapper.insertSelective(user);
        return new NewUserRes(true);
    }

    private void checkMethod(String ptAccount, String ptPassword, String ptEmail, String account, String password, String email) {
        if (!account.matches(ptAccount)) {
            throw new InventoryException(RtnConst.REQ_USER_ACCOUNT_ERROR);
        }
        if (!password.matches(ptPassword)) {
            throw new InventoryException(RtnConst.REQ_USER_PASSWORD_ERROR);
        }
        if (!email.matches(ptEmail)) {
            throw new InventoryException(RtnConst.REQ_USER_EMAIL_ERROR);
        }
    }

    @Override
    public LoginRes login(LoginReq loginReq) {

        User user = new User();

        user = userMapper.selectByPrimaryKey(loginReq.getAccount());
        if (user == null) {
            throw new InventoryException(RtnConst.LOGIN_ACCOUNT_ERROR);
        }
        if (loginReq.getPassword().equals(user.getPassword())) {
            LoginRes loginRes = new LoginRes();
            loginRes.setUserName(user.getUsername());
            loginRes.setAccount(user.getAccount());
            return loginRes;
        } else {
            throw new InventoryException(RtnConst.LOGIN_PASSWORD_ERROR);
        }
    }

}
