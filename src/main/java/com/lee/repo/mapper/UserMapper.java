package com.lee.repo.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lee.business.user.User;

@Repository
public interface UserMapper {

	List<User> queryAll();
}
