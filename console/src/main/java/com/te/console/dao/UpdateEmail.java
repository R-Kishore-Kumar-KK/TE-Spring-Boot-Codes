package com.te.console.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateEmail {

	public boolean editEmail(String name, String mail) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("employee");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String update = "update Employee set email = :mail where username = :uname";
			Query query = manager.createQuery(update);
			query.setParameter("mail", mail);
			query.setParameter("uname", name);
			int result = query.executeUpdate();
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (factory != null) {
					factory.close();
				}
				if (manager != null) {
					manager.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
