package com.technoelevatescrum2.ems.service;

import com.technoelevatescrum2.ems.beans.EmployeeInfo;

public interface EmployeeService {

	public EmployeeInfo register(EmployeeInfo info);
	
	public EmployeeInfo login(String email, String password);


	public void getDelete(String email);
}
