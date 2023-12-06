package com.te.console.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServlet;

public class Login extends HttpServlet {

	public boolean validate(String uname, String pwd) {
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		try {
			factory = Persistence.createEntityManagerFactory("employee");
			manager = factory.createEntityManager();

		String Url = " from Employee where username=:name and password=:pass";
		Query query = manager.createQuery(Url);
		query.setParameter("name", uname);
		query.setParameter("pass", pwd);
		Object obj = query.getSingleResult();
		if (obj != null) {
			return true;
		}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

}