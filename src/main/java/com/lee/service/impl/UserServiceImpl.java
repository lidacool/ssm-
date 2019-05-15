package com.lee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lee.business.user.User;
import com.lee.repo.mybatis.dao.UserMapper;
import com.lee.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(long userId) {
        List<User> users = userMapper.queryAll();
        User resultUser = null;
        for (User user : users) {
            if (user.getUserId() == userId) {
                resultUser = user;
            }
        }
        return resultUser;
    }

}
