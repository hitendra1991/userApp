<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="registerProcess.htm" method="post">
		<table align="center">
			<tr>
				<td>Username:</td>
				<td><input type="text" placeholder="Enter Username"
					name="uname"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" placeholder="Enter Password"
					name="pword"></td>
			</tr>
			<tr>
			<tr>
				<td>Firstname:</td>
				<td><input type="text" placeholder="Enter Firstname"
					name="fname"></td>
			</tr>
			<tr>
				<td>Lastname:</td>
				<td><input type="text" placeholder="Enter lastname"
					name="lname"></td>
			</tr>
			<!-- <tr><td><input type="button" value="submit" name="Submit"></td></tr> -->
			<td><button id="confirm_user" type="submit"
					class="btn btn-primary">Confirm Indentity</button></td>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form>
</body>
</html>