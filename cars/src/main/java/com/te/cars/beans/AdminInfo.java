package com.te.cars.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admintable")
public class AdminInfo implements Serializable{

	@Id
	@Column
	private Integer id;
	
	@Column
	private String password;

}
