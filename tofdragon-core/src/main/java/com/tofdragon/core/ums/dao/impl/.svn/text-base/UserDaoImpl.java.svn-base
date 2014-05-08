package com.tofdragon.core.ums.dao.impl;

import java.util.List;

import com.tofdragon.core.ums.dao.UserDao;
import com.tofdragon.core.ums.model.User;
import com.tofdragon.infrastructure.datasource.DataSourceManager;

public final class UserDaoImpl implements UserDao{

    private DataSourceManager dataSourceManager;
	
	public void setDataSourceManager(DataSourceManager dataSourceManager) {
		this.dataSourceManager = dataSourceManager;
	}

	@Override
	public List<User> getAllUsers() {
		return dataSourceManager.queryAll("from User");
	}
}
