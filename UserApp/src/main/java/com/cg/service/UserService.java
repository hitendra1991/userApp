package com.cg.service;

import java.util.List;

import com.cg.model.Login;
import com.cg.model.User;
import com.cg.model.Users;

public interface UserService {

	void registrationProcess(User user);
	
	List<Users> registration(List<Users> users);
	
	boolean loginProcess(Login login);
	
	
	

}
