package com.te.springbootdatajpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springbootdatajpa.beans.EmployeeInfo;

@Repository
public interface EmployeeDAO extends CrudRepository<EmployeeInfo, Integer>{

}
