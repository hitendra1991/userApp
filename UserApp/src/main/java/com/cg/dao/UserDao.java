package com.cg.dao;

import java.util.List;

import com.cg.model.Login;
import com.cg.model.User;
import com.cg.model.Users;

public interface UserDao {
	void registrationProcess(User user);
	
    List<Users> registration(List<Users> users);

	boolean loginProcess(Login login);
}
