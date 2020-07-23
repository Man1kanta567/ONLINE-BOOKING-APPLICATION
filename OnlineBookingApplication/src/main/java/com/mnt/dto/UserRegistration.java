package com.mnt.dto;

import lombok.Data;

@Data
public class UserRegistration 
{
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
