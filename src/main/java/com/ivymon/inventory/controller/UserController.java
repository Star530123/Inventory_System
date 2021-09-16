package com.ivymon.inventory.controller;

import com.ivymon.inventory.entity.User;
import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
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
public class UserController {
    @Autowired
    @Qualifier("UserServiceImpl")
    private IUserService userService;
//get
    @RequestMapping(value = "getUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "測試")
    public Response<User> test(@RequestBody Request<String> request){

        return new Response(userService.getUser(request.getBody()));
    }
    //create
    @RequestMapping(value = "createUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "create")
    public Response<String> create(@RequestBody Request<User> request){
        return new Response<String>(userService.createUser(request.getBody()));
    }
    //update
    @RequestMapping(value = "updateUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "update")
    public  Response<String>update(@RequestBody Request<User> request){
        return new Response<String>(userService.updateUser(request.getBody()));
    }

    //delete
    @RequestMapping(value = "deleteUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "delete")
    public Response<String> delete(@RequestBody Request<String> request){
        return new Response<String>(userService.deleteUser(request.getBody()));
    }
    //research
    @RequestMapping(value = "researchUser", method = {RequestMethod.POST})
    @ResponseBody
    @Operation(description = "research")
    public Response<User>  researchUser(@RequestBody Request<String> request){
        return new Response<User>(userService.researchUser(request.getBody()));
    }

}
