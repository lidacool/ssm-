package com.lee.repo.mybatis.dao;

import java.util.List;

import com.lee.business.user.User;

public interface UserMapper {

    List<User> queryAll();
}
