package com.cg.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.User;
import com.cg.model.Users;
import com.cg.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/registerProcess.htm", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,
			HttpServletResponse response) {
		User user = new User();
		user.setFirstname(request.getParameter("fname"));
		user.setLastname(request.getParameter("lname"));
		user.setPassword(request.getParameter("pword"));
		user.setUsername(request.getParameter("uname"));

		userService.registrationProcess(user);

		return new ModelAndView("submitRegister");
	}
	

	@RequestMapping(value = "/register.htm", method = RequestMethod.POST)
	public ModelAndView listUser(HttpServletRequest request,
			HttpServletResponse response) {
		User user = new User();
		List<Users> users=new ArrayList<Users>();
		user.setFirstname(request.getParameter("fname"));
		user.setLastname(request.getParameter("lname"));
		user.setPassword(request.getParameter("pword"));
		user.setUsername(request.getParameter("uname"));
	
		//users.addAll((Collection<? extends Users>) user);

		userService.registration(users);

		return new ModelAndView("submitRegister");
	}

}
