package com.mybatis.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 验证登录（使用@Param）
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 添加用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录
     *
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 通过用户名获取用户信息
     *
     * @param username 用户名
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 查询所有的用户信息
     */
    List<User> getAllUser();
}
