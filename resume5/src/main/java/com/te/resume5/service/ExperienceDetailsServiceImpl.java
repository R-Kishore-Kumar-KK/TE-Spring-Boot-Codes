package com.te.resume5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.ExperienceDetails;
import com.te.resume5.dao.ExperienceDetailsDao;

@Service
public class ExperienceDetailsServiceImpl implements ExperienceDetailsService{

	@Autowired
	private ExperienceDetailsDao dao;

	
	@Override
	public List<ExperienceDetails> registerExperienceDetails(List<ExperienceDetails> experienceDetails) {
		return dao.saveAll(experienceDetails);
	}

}
