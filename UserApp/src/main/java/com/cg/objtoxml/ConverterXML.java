package com.cg.objtoxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.cg.model.Login;
import com.cg.model.User;
import com.cg.model.Users;

public class ConverterXML {
	User userDetails;
	JAXBContext jaxbContext;
	String fileName = "C:/Users/hitekuma/Documents/user.xml";
	static Users users=new Users();
	static{
		 User user=new User();
		 users.setUsers(new ArrayList<User>());
		 user.setFirstname(user.getFirstname());
		 user.setLastname(user.getLastname());
		 user.setUsername(user.getUsername());
		 user.setPassword(user.getPassword());
		 
		 users.getUsers().add(user);
		 
	}
	
	/*public List<Users> marshall(List<Users> users) throws FileNotFoundException {
		try {

			File file = new File(fileName);
			jaxbContext = JAXBContext.newInstance(Users.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(users, file);
			
			FileInputStream fis = new FileInputStream(file);
			System.out.println("Marshling: " + fis);

		} catch (JAXBException e) {

			e.printStackTrace();
		} finally {

		}
		return  users;

	}*/
	/*------------------------------------------------*/
	
	public void marshalling(User user) throws FileNotFoundException {
		
		try {   
			File file = new File(fileName);
			jaxbContext = JAXBContext.newInstance(User.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//jaxbMarshaller.marshal(user,file);
			 jaxbMarshaller.marshal(user, new FileOutputStream(file));
			
			FileInputStream fis = new FileInputStream(file);
			System.out.println("Marshling: " + fis);

		} catch (JAXBException e) {

			e.printStackTrace();
		} finally {

		}

	}

	public boolean userValidate(Login login) {
		User user = new User();
		File xmlFile = new File(fileName);

		try {
			jaxbContext = JAXBContext.newInstance(User.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			user = (User) jaxbUnmarshaller.unmarshal(xmlFile);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		String loginName = login.getUsername();
		String loginPass = login.getPassword();
		String username = user.getUsername();
		String password = user.getPassword();

		if (loginName.equalsIgnoreCase(username)
				&& (loginPass.equalsIgnoreCase(password))) {
			return true;
		} else {
			return false;
		}

	}

}
