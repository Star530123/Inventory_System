package com.ivymon.inventory;

import com.ivymon.inventory.entity.GoodsCategory;
import com.ivymon.inventory.entity.mapper.GoodsCategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventoryApplicationTests {

	@Autowired
	GoodsCategoryMapper goodsCategoryMapper;

	@Test
	void contextLoads() {
		GoodsCategory goodsCategory = new GoodsCategory();
		goodsCategory.setCategoryName("容器");
		System.out.println("Before:" + goodsCategory.getCategorySeq());
		goodsCategoryMapper.insertSelective(goodsCategory);
		System.out.println("After:" + goodsCategory.getCategorySeq());
	}

}
