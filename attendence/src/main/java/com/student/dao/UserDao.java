package com.student.dao;

import java.util.List;

import org.apache.struts.action.ActionServlet;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.mysql.cj.Session;
import com.student.util.HibernatePlugin;

public class UserDao {
	
	@SuppressWarnings("deprecation")
	public int findUsers(String loginId,ActionServlet servlet)
	{
		
		SessionFactory hib = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.KEY_NAME);
		org.hibernate.Session session = hib.openSession();
		org.hibernate.Transaction tx =  session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<UserDetails> query = session.createSQLQuery("select * from UserDetails WHERE loginId = :userName");
		query.setString("userName", loginId);
		List<UserDetails> results = query.list();
		tx.commit(); 
		return results.size()>0?1:0;
	}

	
	public int saveUser(UserDetails user,ActionServlet servlet)
	{
		
		SessionFactory hib = (SessionFactory) servlet.getServletContext().getAttribute(HibernatePlugin.KEY_NAME);
		org.hibernate.Session session = hib.openSession();
		org.hibernate.Transaction tx =  session.beginTransaction();
		session.save(user);
		tx.commit(); 
		return 1;
	}

}
