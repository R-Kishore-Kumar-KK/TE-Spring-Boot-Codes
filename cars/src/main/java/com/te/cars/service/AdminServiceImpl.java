package com.te.cars.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.cars.beans.AdminInfo;
import com.te.cars.dao.AdminDao;

public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao dao;

	@Override
	public AdminInfo authenticate(Integer id, String password) {
		if(id <= 0) {
			return null;
		}
		return dao.authenticate(id, password);
	}
	
	
	
}
