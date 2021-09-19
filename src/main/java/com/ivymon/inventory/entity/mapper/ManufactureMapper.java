package com.ivymon.inventory.entity.mapper;

import com.ivymon.inventory.entity.Manufacture;
import com.ivymon.inventory.entity.ManufactureExample;

public interface ManufactureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    long countByExample(ManufactureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    int deleteByPrimaryKey(Integer manuSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    int insert(Manufacture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    int insertSelective(Manufacture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    Manufacture selectByPrimaryKey(Integer manuSeq);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    int updateByPrimaryKeySelective(Manufacture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manufacture
     *
     * @mbg.generated Thu Sep 16 14:54:01 CST 2021
     */
    int updateByPrimaryKey(Manufacture record);
}