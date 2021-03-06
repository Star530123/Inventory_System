package com.ivymon.inventory.entity.mapper;

import com.ivymon.inventory.entity.GoodInfoVo;
import com.ivymon.inventory.entity.GoodsInfo;
import com.ivymon.inventory.entity.GoodsInfoExample;
import com.ivymon.inventory.entity.QueryGoods;

import java.util.List;

public interface GoodsInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    long countByExample(GoodsInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    int deleteByPrimaryKey(Integer goodsSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    int insert(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    int insertSelective(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    GoodsInfo selectByPrimaryKey(Integer goodsSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    int updateByPrimaryKeySelective(GoodsInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_info
     *
     * @mbg.generated Wed Oct 20 10:06:08 CST 2021
     */
    int updateByPrimaryKey(GoodsInfo record);
    List<GoodInfoVo> selectByGoodNamelike(QueryGoods queryGoods);
}