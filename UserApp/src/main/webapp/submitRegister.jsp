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
		<h1>Regitraion sucessfully!!</h1>
			<tr>
				<td>Username:</td>
				<td><input type="text" placeholder="Enter Username"
					name="uname" disabled="disabled"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" placeholder="Enter Password"
					name="pword" disabled="disabled"></td>
			</tr>
			<tr>
			<tr>
				<td>Firstname:</td>
				<td><input type="text" placeholder="Enter Firstname"
					name="fname" disabled="disabled"></td>
			</tr>
			<tr>
				<td>Lastname:</td>
				<td><input type="text" placeholder="Enter lastname"
					name="lname" disabled="disabled"></td>
			</tr>

			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form>
</body>
</html>