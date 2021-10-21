package com.ivymon.inventory.service.impl;

import com.ivymon.inventory.entity.Product;
import com.ivymon.inventory.entity.mapper.ProductMapper;
import com.ivymon.inventory.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProduct(Integer id) {

        return productMapper.selectByPrimaryKey(id);
    }


}
