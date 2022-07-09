package com.imaginnovate.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.imaginnovate.entity.User;
import com.imaginnovate.exception.ResourceNofoundException;
import com.imaginnovate.repository.UserRepository;
import com.imaginnovate.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
    //for save method
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


	@Override
	public User getUserById(long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User updateUser(User user, long id) {
		User exitingUser = userRepository.findById(id).orElseThrow(()->new  ResourceNofoundException ("User","ID",id));
		exitingUser.setName(user.getName());
		exitingUser.setUsername(user.getUsername());
		exitingUser.setEmail(user.getEmail());
		return exitingUser;
	}

	@Override
	public void deleteUser(long id) {
		userRepository.findById(id).orElseThrow(() -> new  ResourceNofoundException ("User","ID",id));
		userRepository.deleteById(id);
		
	}


	
}
