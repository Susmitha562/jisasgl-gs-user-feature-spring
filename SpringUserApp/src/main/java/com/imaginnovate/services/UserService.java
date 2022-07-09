package com.imaginnovate.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imaginnovate.entity.User;
import com.imaginnovate.repository.UserRepository;


public interface UserService {
	
	    User saveUser(User user); 
		List<User> getAllUsers();
		User getUserById(long id);
		User updateUser(User user,long id);
		void deleteUser(long id);
		
	}



