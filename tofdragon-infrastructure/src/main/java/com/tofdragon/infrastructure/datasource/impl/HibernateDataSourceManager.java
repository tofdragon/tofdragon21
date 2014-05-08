package com.tofdragon.infrastructure.datasource.impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.tofdragon.infrastructure.datasource.DataSourceManager;

/**
 * Hibernate的数据库管理
 * @author sunjing
 * @date   20140501
 *
 */
public final class HibernateDataSourceManager implements DataSourceManager{

	//private HibernateDaoSupport hibernateDaoSupport;
	
	private HibernateTemplate hibernateTemplate;
	
//	public void setHibernateDaoSupport(HibernateDaoSupport hibernateDaoSupport) {
//		this.hibernateDaoSupport = hibernateDaoSupport;
//	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List queryAll(String sql) {
		return hibernateTemplate.find(sql);
	}
}
