package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDao;
import com.cg.model.Login;
import com.cg.model.User;
import com.cg.model.Users;

@Service("userService")
public class UesrServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void registrationProcess(User user) {

		this.userDao.registrationProcess(user);

	}

	public boolean loginProcess(Login login) {

		boolean flag = this.userDao.loginProcess(login);

		return flag;
	}

	
	public List<Users> registration(List<Users> users) {
		
		return this.userDao.registration(users);
	}

}
