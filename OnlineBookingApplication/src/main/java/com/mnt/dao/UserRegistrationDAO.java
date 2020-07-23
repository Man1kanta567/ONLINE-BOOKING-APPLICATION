package com.mnt.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_registration_tab")
public class UserRegistrationDAO 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	  private String username;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String mail;
	  private int age;
	  private String gender;
	  private String note;
}
