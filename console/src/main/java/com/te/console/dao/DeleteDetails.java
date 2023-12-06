package com.te.console.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDetails {
	
	public boolean deleteRecord(String uname) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			factory = Persistence.createEntityManagerFactory("employee");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			String delete = "delete from Employee where username = :name ";
			Query query = manager.createQuery(delete);
			query.setParameter("name", uname);
			query.executeUpdate();
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			transaction.rollback();
			
		}
		return false;
	}
}