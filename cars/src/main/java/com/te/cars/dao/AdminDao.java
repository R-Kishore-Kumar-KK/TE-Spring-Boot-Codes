package com.te.cars.dao;

import com.te.cars.beans.AdminInfo;

public interface AdminDao {

	public AdminInfo authenticate(Integer id, String password);
}
