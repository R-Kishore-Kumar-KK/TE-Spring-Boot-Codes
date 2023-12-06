package com.te.resume5.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.PersonalDetails;
import com.te.resume5.dao.PersonalDetailsDao;
import com.te.resume5.exception.DetailsNotFoundException;
import com.te.resume5.exception.RegisterException;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

	@Autowired
	private PersonalDetailsDao dao;
	
	@Override
	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails) {
		return dao.save(personalDetails);
	}

	@Override
	public Object getUser(@Valid Integer user_id) {
		if(user_id > 0) {
			return dao.findById(user_id);
		} else {
			return new RegisterException("Data Not Found");
		}
	}

	

}
