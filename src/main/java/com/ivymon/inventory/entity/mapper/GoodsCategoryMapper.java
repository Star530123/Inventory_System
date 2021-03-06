package com.ivymon.inventory.entity.mapper;

import com.ivymon.inventory.entity.GoodsCategory;
import com.ivymon.inventory.entity.GoodsCategoryExample;

import java.util.List;

public interface GoodsCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    long countByExample(GoodsCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    int deleteByPrimaryKey(Integer categorySeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    int insert(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    int insertSelective(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    GoodsCategory selectByPrimaryKey(Integer categorySeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    int updateByPrimaryKeySelective(GoodsCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_category
     *
     * @mbg.generated Thu Sep 16 14:54:44 CST 2021
     */
    int updateByPrimaryKey(GoodsCategory record);

    List<GoodsCategory> selectAll();
}