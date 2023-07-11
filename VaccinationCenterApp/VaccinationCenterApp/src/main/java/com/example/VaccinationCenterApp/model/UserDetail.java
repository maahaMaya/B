package com.example.VaccinationCenterApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class UserDetail {
	
	@Id
	@GeneratedValue
	private int userId;
	
	private String name;
	private String email;
	private String password;
}
