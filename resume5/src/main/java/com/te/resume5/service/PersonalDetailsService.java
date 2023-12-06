package com.te.resume5.service;

import javax.validation.Valid;

import com.te.resume5.beans.PersonalDetails;

public interface PersonalDetailsService {

	public PersonalDetails registerPersonalDetails(PersonalDetails personalDetails);

	public Object getUser(@Valid Integer user_id);
}
