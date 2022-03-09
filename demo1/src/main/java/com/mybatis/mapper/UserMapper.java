package com.mybatis.mapper;

import com.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    int insertUser(); // 添加用户

    void updateUser(); // 修改用户

    void deleteUser(); // 删除用户

    User getUserById(); // 通过id查询用户

    List<User> getAllUser(); // 查询所有的用户
}
