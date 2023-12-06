package com.te.resume5.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume5.beans.PersonalDetails;

@Repository
public interface PersonalDetailsDao extends JpaRepository<PersonalDetails, Integer>{

}
