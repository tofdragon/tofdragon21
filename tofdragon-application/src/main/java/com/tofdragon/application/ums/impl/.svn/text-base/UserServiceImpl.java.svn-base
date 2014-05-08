package com.tofdragon.application.ums.impl;

import java.util.List;

import com.tofdragon.application.ums.UserService;
import com.tofdragon.core.ums.dao.UserDao;
import com.tofdragon.core.ums.model.User;

/**
 * 用户服务实现类
 * @author sunjing
 * @date   20140501
 *
 */
public final class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
