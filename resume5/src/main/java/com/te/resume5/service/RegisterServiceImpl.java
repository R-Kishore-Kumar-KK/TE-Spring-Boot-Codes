package com.te.resume5.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.PersonalDetails;
import com.te.resume5.beans.UserRegister;
import com.te.resume5.dao.RegisterDao;
import com.te.resume5.exception.RegisterException;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDao dao;
	
	@Override
	@Transactional
	public UserRegister register(UserRegister info) {
		if(info != null) {
			return dao.save(info);
		}
			throw new RegisterException("Data already Exist");
	}

	@Override
	public UserRegister login(String email, String password) {
		if ((!email.isEmpty() && email != null) && (!password.isEmpty() && password != null)) {
			UserRegister logg = dao.findByEmailAndPassword(email, password);
			if (logg != null) {
				return logg;
			} else {
				throw new RegisterException("Invalid Credentials");
			}
		} else {
			throw new RegisterException("Enter valid Login Details");
		}
	}

	/*
	 * @Override public PersonalDetails getUser(Integer user_id) {
	 * Optional<PersonalDetails> info = dao.findById(user_id); UserRegister info1 =
	 * info.get(); return info1; }
	 */

}
