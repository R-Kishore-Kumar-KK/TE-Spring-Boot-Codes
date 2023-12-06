package com.te.resume5.service;

import java.util.List;

import javax.validation.Valid;

import com.te.resume5.beans.PersonalDetails;
import com.te.resume5.beans.UserRegister;


public interface RegisterService {

	public UserRegister register(UserRegister info);
	
	public UserRegister login(String email, String password);

}
