package com.kmxy.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_tag
 *
 * @mbg.generated do_not_delete_during_merge
 */
@Data
public class Tag implements Serializable {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_id
     *
     * @mbg.generated
     */
    private Integer tagId;

    /**
     * Database Column Remarks:
     *   标签名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.tag_name
     *
     * @mbg.generated
     */
    private String tagName;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   删除标志：1-删除 0-未删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.del_flag
     *
     * @mbg.generated
     */
    private Boolean delFlag;

    /**
     * Database Column Remarks:
     *   删除时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_tag.del_time
     *
     * @mbg.generated
     */
    private Date delTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tag
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}