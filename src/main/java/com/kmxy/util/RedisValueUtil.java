package com.kmxy.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.Map;


/**
 * redis数据操作工具类
 * @date : 2020/1/16 15:48
 */
@Component
public final class RedisValueUtil {


    @Autowired
    private HashOperations<String, String, Serializable> hashOperations;

  


    /** -------------------hash相关操作------------------------- */

    /**
     * 功能描述: 获取存储在哈希表中指定字段的值
     *
     * @param key   1
     * @param field 2
     * @return java.lang.Object
     **/
    public Serializable hGet(String key, String field) {
        return hashOperations.get(key, field);
    }

    /**
     * 功能描述: 获取所有给定字段的值
     *
     * @param key 1
     * @return java.util.Map<java.lang.String, java.io.Serializable>
     * 
     * @date 2020/1/16 16:55
     **/
    public Map<String, Serializable> hGetAll(String key) {
        return hashOperations.entries(key);
    }


    /**
     * 功能描述: 指定key下新增元素
     *
     * @param key     1
     * @param hashKey 2
     * @param value   3
     **/
    public void hPut(String key, String hashKey, Serializable value) {
        hashOperations.put(key, hashKey, value);
    }


    
    /**
     * 功能描述: 查看哈希表 key 中，指定的字段是否存在
     *
     * @param key   1
     * @param field 2
     * @return boolean
     **/
    public boolean hExists(String key, String field) {
        return hashOperations.hasKey(key, field);
    }

    /**
     * 功能描述: 为哈希表 key 中的指定字段的整数值自增1
     *
     * @param key   1
     * @param field 2
     * @return java.lang.Long
     **/
    public Long hIncr(String key, String field) {
        return hashOperations.increment(key, field, 1);
    }


    
   
}
