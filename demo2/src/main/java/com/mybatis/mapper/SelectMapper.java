package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     */
    List<User> getAllUser();

    /**
     * 查询用户总记录数
     *
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为一个Map集合
     *
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为Map集合
     *
     * @return
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
//    List<Map<String, Object>> getAllUserToMap();
}
