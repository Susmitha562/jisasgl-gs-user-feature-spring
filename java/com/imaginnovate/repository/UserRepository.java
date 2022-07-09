package com.imaginnovate.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.imaginnovate.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public List<User> user = new ArrayList<User>();

	public java.util.List<User> saveAll(User users);

}
