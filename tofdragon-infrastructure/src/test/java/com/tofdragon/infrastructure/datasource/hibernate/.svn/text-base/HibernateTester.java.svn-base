package com.tofdragon.infrastructure.datasource.hibernate;

import junit.framework.Assert;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

public class HibernateTester {

	private static SessionFactory sessionFactory;

	private final static String HIBERNATE_CFG_PATH = "/datasource/hibernate/hibernate.cfg.xml";
	
	@BeforeClass
	public static void beforeClass() {
		try {
			Configuration cfg = new Configuration().configure("HIBERNATE_CFG_PATH");
			StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
			sb.applySettings(cfg.getProperties());
			StandardServiceRegistry standardServiceRegistry = sb.build();
			sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
		} catch (Throwable th) {
			System.err.println("Enitial SessionFactory creation failed" + th);
			throw new ExceptionInInitializerError(th);
		}
	}

	@Test
	public void testSessionFactoryConnection() {
		Assert.assertNotNull(sessionFactory);
	}
}
