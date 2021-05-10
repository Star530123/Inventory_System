package com.ivymon.inventory.controller;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.model.Request;
import com.ivymon.inventory.model.Response;
import com.ivymon.inventory.service.IProductService;
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
@Api(tags = "TEST")
public class ProductController {
    @Autowired
    @Qualifier("ProductServiceImpl")
    private IProductService productService;


    @RequestMapping(value = "test", method = {RequestMethod.DELETE})
    @ResponseBody
    @Operation(description = "測試")
    public Response<Product> test(@RequestBody Request<Integer> request) {
        return new Response<>(productService.getProduct(request.getBody()));
    }
}
