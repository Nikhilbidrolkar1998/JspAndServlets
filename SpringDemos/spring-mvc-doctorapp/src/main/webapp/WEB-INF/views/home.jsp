<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: right;">
	<a href="admin">admin</a><br>
</div>
<form action="search">
	Enter Speciality<input type="text" name="choice"><br>
	<input type="submit" value="search">
</form>
	
	<h2>All Doctors</h2>
	<h2 style="{color: red}">${doctors }</h2>
	
</body>
</html>