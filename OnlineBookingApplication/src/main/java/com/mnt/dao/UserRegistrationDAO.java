package com.mnt.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_registration_tab")
public class UserRegistrationDAO 
{
	@Id
	private Integer id;
	  private String name;
	  private String password;
	  private String firstname;
	  private String lastname;
	  private String mail;
	  private int age;
	  private String gender;
	  private String note;
}
