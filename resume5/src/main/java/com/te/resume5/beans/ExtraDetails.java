package com.te.resume5.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@Entity
@Table(name = "extra_details")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtraDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private Integer user_id;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer extra_id;
	
	@Column
	private String skill1;
	
	@Column
	private String skill2;
	
	@Column
	private String skill3;
	
	@Column
	private String skill4;
	
	@Column
	private String skill5;
	
	@Column
	private String skill6;
	
	@Column
	private String interest1;
	
	@Column
	private String interest2;
	
	@Column
	private String interest3;
	
	@Column
	private String interest4;
	
	@Column
	private String interest5;
	
	@Column
	private String interest6;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="user_id",insertable = false,updatable = false)
	private PersonalDetails extra;
}
