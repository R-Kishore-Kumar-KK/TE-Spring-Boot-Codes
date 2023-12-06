package com.te.resume5.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resume5.beans.PersonalDetails;
import com.te.resume5.beans.UserRegister;

@Repository
public interface RegisterDao extends JpaRepository<UserRegister, Integer> {

	public UserRegister findByEmailAndPassword(String email, String password);

	/* public List<UserRegister> findAllById(List<UserRegister> user_id); */

}
