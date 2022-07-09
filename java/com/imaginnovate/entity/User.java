package com.imaginnovate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;


@Entity
@Table(name="JBHUSER")
@Data
public class User {


		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		
		@NotBlank(message = "Name is mandatory")
		@Column(name="name")
		private String name;
		
		@Column(name ="first_name")
		private String username;
		
		@NotEmpty(message = "Enter email")
		@Pattern(regexp="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$+",message="invalid email")
		@Column(name ="email")
		private String email;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
