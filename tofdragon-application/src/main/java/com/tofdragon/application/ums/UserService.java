package com.tofdragon.application.ums;

import java.util.List;

import com.tofdragon.core.ums.model.User;


/**
 * 用户服务类
 * @author sunjing
 * @date   20140504
 *
 */
public interface UserService {

	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getAllUsers();
}
