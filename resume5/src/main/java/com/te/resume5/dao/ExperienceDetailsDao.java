package com.te.resume5.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume5.beans.ExperienceDetails;

@Repository
public interface ExperienceDetailsDao extends JpaRepository<ExperienceDetails, Integer>{

}