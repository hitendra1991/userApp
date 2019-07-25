package com.cg.dao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.model.Login;
import com.cg.model.User;
import com.cg.model.Users;
import com.cg.objtoxml.ConverterXML;

@Service("userDao")
public class UserDaoImpl implements UserDao {
	ConverterXML convert = new ConverterXML();

	public void registrationProcess(User user) {
		try {
			convert.marshalling(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean loginProcess(Login login) {

		boolean flag = convert.userValidate(login);

		return flag;
	}


	public List<Users> registration(List<Users> users) {
		
		
		/*List<Users> userList = null;
		try {
			userList = convert.marshall(users);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<User> userList=new ArrayList<User>();
		userList.add(user);*/
		
		return null;
	}

	

}
