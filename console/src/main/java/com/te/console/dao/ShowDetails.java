package com.te.console.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.console.beans.Employee;

public class ShowDetails {

	public List<Employee> showRecord(String name) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		List<Employee> result = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("employee");
			manager = factory.createEntityManager();

			String fetch = " from Employee where username=:name";
			Query query = manager.createQuery(fetch);
			query.setParameter("name", name);
			result = query.getResultList();
			
			if (result != null) {
				return result;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		factory.close();
		manager.close();
		
		return null;
	}

}

