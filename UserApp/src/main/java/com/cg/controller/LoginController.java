package com.cg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.Login;
import com.cg.model.User;
import com.cg.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/loginProcess.htm", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,
			HttpServletResponse response) {
		boolean flag = false;
		Login login = new Login();
		login.setPassword(request.getParameter("pword"));
		login.setUsername(request.getParameter("uname"));

		flag = userService.loginProcess(login);
		if (flag == true) {
			return new ModelAndView("welcome", "uname", login);
		} else {
			return new ModelAndView("login", "uname", login);
		}
	}

}
