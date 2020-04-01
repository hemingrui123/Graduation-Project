package com.kmxy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kmxy.entity.Tag;
import com.kmxy.entity.TagExample;

public interface TagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    long countByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int deleteByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int insert(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int insertSelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    List<Tag> selectByExample(TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    Tag selectByPrimaryKey(Integer tagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Tag record);
}