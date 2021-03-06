package com.ivymon.inventory.entity.mapper;

import com.ivymon.inventory.entity.GoodsItem;
import com.ivymon.inventory.entity.GoodsItemExample;
import com.ivymon.inventory.entity.ItemVo;
import com.ivymon.inventory.model.response.ItemListRes;

import java.util.List;

public interface GoodsItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    long countByExample(GoodsItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    int deleteByPrimaryKey(Integer itemSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    int insert(GoodsItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    int insertSelective(GoodsItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    GoodsItem selectByPrimaryKey(Integer itemSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    int updateByPrimaryKeySelective(GoodsItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_item
     *
     * @mbg.generated Sat Sep 25 11:50:45 CST 2021
     */
    int updateByPrimaryKey(GoodsItem record);

    List<ItemListRes> selectAll();

    List<ItemVo>selectByCategorySeq(Integer categorySeq);
    List<ItemVo> selectAllItemVo();


}