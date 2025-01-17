package com.technoelevatescrum2.ems.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevatescrum2.ems.beans.EmployeeInfo;
import com.technoelevatescrum2.ems.beans.EmployeeResponse;
import com.technoelevatescrum2.ems.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "/register")
	public ResponseEntity<EmployeeResponse> storeData(@Valid @RequestBody EmployeeInfo info) {
		EmployeeResponse response = new EmployeeResponse(false, service.register(info));
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<EmployeeResponse> login(@RequestBody EmployeeInfo login) {
		EmployeeResponse response = new EmployeeResponse(false, service.login(login.getEmail(), login.getPassword()));
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{email}")
	public ResponseEntity<EmployeeResponse> getDelete(@PathVariable String email){
		service.getDelete(email);
		EmployeeResponse response = new EmployeeResponse(false,"Deleted Successfully" );
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
	}
}
