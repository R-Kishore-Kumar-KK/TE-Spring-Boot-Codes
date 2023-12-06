package com.te.resume5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.resume5.beans.ProjectDetails;
import com.te.resume5.dao.ProjectDetailsDao;

@Service
public class ProjectDetailsServiceImpl implements ProjectDetailsService{

	@Autowired
	private ProjectDetailsDao dao;
	
	@Override
	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails) {
		return dao.saveAll(projectDetails);
	}

}
