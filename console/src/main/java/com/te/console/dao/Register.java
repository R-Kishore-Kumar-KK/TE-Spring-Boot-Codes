package com.te.console.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.console.beans.Employee;

public class Register {

	public boolean createDetails(String name, String uname, String pwd, int age, String email, String role,
			double salary) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			factory = Persistence.createEntityManagerFactory("employee");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			Employee info = new Employee();
			info.setName(name);
			info.setUsername(uname);
			info.setPassword(pwd);
			info.setAge(age);
			info.setEmail(email);
			info.setRole(role);
			info.setSalary(salary);

			transaction.begin();
			manager.persist(info);
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
