package com.te.resume5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.EducationInfo;
import com.te.resume5.dao.EducationInfoDao;

@Service
public class EducationInfoServiceImpl implements EducationInfoService{

	@Autowired(required = false)
	private EducationInfoDao dao;
	
	@Override
	public List<EducationInfo> registerEducationInfo(List<EducationInfo> educationInfo) {
		return dao.saveAll(educationInfo);
	}

}
