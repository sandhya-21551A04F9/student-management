<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="bootstrap.jsp"%>
<body>

	<form action="register" method="post">
	
	<input type="text" placeholder="Enter rollnumber" name="rollnumber" class="form-control">
	<input type="text" placeholder="Enter name" name="name" class="form-control">
	<input type="email" placeholder="Enter email" name="email" class="form-control">
	<input type="text" placeholder="Enter branch" name="branch" class="form-control">
	<input type="text" placeholder="Enter section" name="section" class="form-control">
	<button class="btn btn-primary">Register</button>
	
	</form>
</body>
</html>