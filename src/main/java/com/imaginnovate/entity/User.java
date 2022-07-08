package com.imaginnovate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



@Entity
@Table(name="JBHUSER")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String name;
	@Column(name ="first_name")
	private String username;
	
	@NotEmpty(message = "Enter email")
	@Pattern(regexp="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$+",message="invalid email")
	@Column(name ="email")
	private String email;
	
	
	
}
