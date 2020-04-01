package com.kmxy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.kmxy.entity.Message;
import com.kmxy.entity.MessageExample;

public interface MessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    long countByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int deleteByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    List<Message> selectByExampleWithBLOBs(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    List<Message> selectByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    Message selectByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Message record);
}