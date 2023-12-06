package com.te.resume5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.ExtraDetails;
import com.te.resume5.dao.ExtraDetailsDao;

@Service
public class ExtraDetailsServiceImpl implements ExtraDetailsService{

	@Autowired
	private ExtraDetailsDao dao;
	
	@Override
	public List<ExtraDetails> registerExtraDetails(List<ExtraDetails> extraDetails) {
		return dao.saveAll(extraDetails);
	}

}
