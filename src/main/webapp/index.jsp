<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to my BMI Calculator</title>
</head>
<body>
	<h1>Welcome to my BMI Calculator</h1>
	<form action= "getBMIServlet" method="post">
		Enter your height:
		Feet:
		<input type="text" name="userFeet" size="10">
		Inches:
		<input type="text" name="userInches" size="10">
		Enter your weight (pounds):
		<input type="text" name="userWeight" size="10">
		<input type="submit" value="Calculate BMI" />
	</form>
	

</body>
</html>