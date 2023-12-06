package com.te.cars.service;

import com.te.cars.beans.AdminInfo;

public interface AdminService {

	public AdminInfo authenticate(Integer id, String password);
}
