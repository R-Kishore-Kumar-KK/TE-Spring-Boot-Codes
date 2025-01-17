package com.technoelevatescrum2.ems.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevatescrum2.ems.beans.EmployeeInfo;
import com.technoelevatescrum2.ems.dao.EmployeeDao;
import com.technoelevatescrum2.ems.exception.DeleteException;
import com.technoelevatescrum2.ems.exception.RegisterException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	@Transactional
	public EmployeeInfo register(EmployeeInfo info) {
		if (info != null) {
			return dao.save(info);
		}
		throw new RegisterException("User Already Exist");
	}

	@Override
	public EmployeeInfo login(String email, String password) {

		EmployeeInfo logg = dao.findByEmailAndPassword(email, password);
		if (logg != null) {
			return logg;
		} else {
			throw new RegisterException("Invalid Credentials");
		}

	}

	@Override
	public void getDelete(String email) {
		EmployeeInfo info = new EmployeeInfo();
		if (email != null && email==info.getEmail()) {
			
				dao.deleteById(email);

			} else {
				throw new DeleteException("Email Not Valid");
			}
		}

	}


