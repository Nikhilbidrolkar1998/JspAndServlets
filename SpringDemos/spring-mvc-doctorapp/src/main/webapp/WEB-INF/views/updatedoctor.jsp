<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="updateDoctor">
	Enter Doctor id<input type="text" name="doctorId" value="${doctor.doctorId}" readonly><br>
	Enter Doctor Name<input type="text" name="doctorName" value="${doctor.doctorName}" readonly><br>
	Enter fees<input type="number" name="fees" value="${doctor.fees}" ><br>
	Enter Rating<input type="number" name="rating" value="${doctor.rating}" readonly><br>
	Enter Experience<input type="number" name="experience" value="${doctor.experience}" readonly> <br>
	<input type="submit" value="submit">
	</form>
</body>
</html>