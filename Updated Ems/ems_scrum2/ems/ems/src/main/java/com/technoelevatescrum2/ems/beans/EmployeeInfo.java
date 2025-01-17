package com.technoelevatescrum2.ems.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "ems_reg")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeInfo implements Serializable{


	@Id
	@Column(name = "Email_address")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
	@NotNull(message = "Email should not be Null")
	@NotEmpty(message = "Email should not be Empty")
	private String email;
	
	@Column(name = "Name")
	@NotNull(message = "Name should not be Null")
	@NotEmpty(message = "Name should not be Empty")
	private String name;
	
	@Column(name = "Username")
	@NotNull(message = "UserName should not be Null")
	@NotEmpty(message = "UserName should not be Empty")
	private String userName;
	
	@Column(name = "Password")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$", message = "Password must be atleast 6 characters, One Uppercase, One Lowercase, One Number and One Special Characters")
	@NotNull(message = "Password should not be Null")
	@NotEmpty(message = "Password should not be Empty")
	private String password;
}
