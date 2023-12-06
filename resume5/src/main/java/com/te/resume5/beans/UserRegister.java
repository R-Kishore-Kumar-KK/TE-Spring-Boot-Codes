package com.te.resume5.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.Data;

@Data
@Entity
@Table(name = "register_table")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRegister implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	@NotEmpty(message = "First Name should not be empty")
	@NotNull(message = "First Name should not be null")
	private String first_name;
	
	@Column
	private String last_name;
	
	@Id
	@Column
	@NotEmpty(message = "Email should not be empty")
	@NotNull(message = "Email should not be null")
	private String email;
	
//	@Pattern(regexp = "[0-9]{10}$", message="Phone Number must be 10 digits")
	@Column
	@NotNull(message = "Phone Number should not be null")
	@Min(value = 10l, message = "Phone Number must be 10 digits")
	private Long phone_number;
	
	@Column
//	@Pattern(regexp  = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{8,20}$")
	@NotNull(message = "Password Should not be null")
	@NotEmpty(message = "Password Should not be Empty")
	private String password;
	
}
