package com.te.resume5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume5.beans.ProjectDetails;

@Repository
public interface ProjectDetailsDao extends JpaRepository<ProjectDetails, Integer>{

}
