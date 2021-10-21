package com.ivymon.inventory.controller;

import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.model.request.LoginReq;
import com.ivymon.inventory.model.request.NewUserReq;
import com.ivymon.inventory.model.response.LoginRes;
import com.ivymon.inventory.model.response.NewUserRes;
import com.ivymon.inventory.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "USER")
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private IUserService userService;

    @RequestMapping(value = "/newUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "新增使用者")
    public Response<NewUserRes> newUser(@RequestBody Request<NewUserReq> request) {
        return new Response<>(userService.newUser(request.getBody()));
    }

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "使用者登入")
    public Response<LoginRes> login(@RequestBody Request<LoginReq> request) {
        return new Response<>(userService.login(request.getBody()));


    }


}
