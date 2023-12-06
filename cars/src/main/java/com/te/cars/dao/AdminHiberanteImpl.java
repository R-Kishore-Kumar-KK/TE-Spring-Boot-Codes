package com.te.cars.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import com.te.cars.beans.AdminInfo;
import com.te.cars.exceptions.AdminException;

public class AdminHiberanteImpl implements AdminDao {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public AdminInfo authenticate(Integer id, String password) {
		EntityManager manager = factory.createEntityManager();
		AdminInfo info = manager.find(AdminInfo.class, id);
		if (info != null) {
			if (info.getPassword().equals(password)) {
				return info;
			}
		}
		manager.close();
		  throw new AdminException("Invalid Crdentials");
	}
}


