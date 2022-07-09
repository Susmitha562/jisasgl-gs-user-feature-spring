package com.imaginnovate.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imaginnovate.repository.UserRepository;

@SpringBootApplication
public class SpringUserAppApplication {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringUserAppApplication.class, args);
		
	}

}
