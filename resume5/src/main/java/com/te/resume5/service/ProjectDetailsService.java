package com.te.resume5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.te.resume5.beans.ProjectDetails;


public interface ProjectDetailsService {

	public List<ProjectDetails> registerProjectDetails(List<ProjectDetails> projectDetails);
}
