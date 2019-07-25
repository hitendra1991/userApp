<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="loginProcess.htm" method="post">
		<table align="center">
			<tr>
				<td>Username:</td>
				<td><input type="text" placeholder="Enter Username" name="uname" ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" placeholder="Enter Password" name="pword" ></td>
			</tr>
			</tr>
			
			 <td><button id="confirm_user" type="submit" class="btn btn-primary">Confirm Indentity</button>
			 </td>
			<tr>
			
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form>
	
</body>
</html>