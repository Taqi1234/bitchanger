package com.student.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hibernate {

   
	protected  static SessionFactory sessionFactory;

	public static SessionFactory  getSessionFactory() {
		final StandardServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(reg).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
			StandardServiceRegistryBuilder.destroy(reg);
		}
		
		return sessionFactory;
	}

	public void exit() {
		sessionFactory.close();
	} 
}
