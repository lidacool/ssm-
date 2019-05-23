package com.lee.business.user;

/*
 * @author lee.com
 * */
public class User {

	private long userId;

	private String userName;
	private String passWorld;

	public User() {
	}

	/* 构造函数，用于ibatis查询返回的结构映射 */
	public User(long userId, String userName, String passWorld) {
		this.userId = userId;
		this.userName = userName;
		this.passWorld = passWorld;
	}

	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassWorld() {
		return passWorld;
	}

}
