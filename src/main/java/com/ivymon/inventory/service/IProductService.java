package com.ivymon.inventory.service;

import com.ivymon.inventory.entity.Product;
import org.springframework.stereotype.Service;

public interface IProductService {

    public Product getProduct(Integer id);
}
