package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.service.IProductService;
import org.springframework.stereotype.Service;

@Service("MockProductServiceImpl")
public class MockProductServiceImpl implements IProductService {
    @Override
    public Product getProduct(Integer id) {
        Product product = new Product();
        product.setId(5);
        product.setName("義美奶茶");
        return product;
    }
}
