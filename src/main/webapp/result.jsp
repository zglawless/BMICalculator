<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
</head>
<body>
	<p>
		${userBMI.getFeet()} feet <br />
		${userBMI.getInches()} inches <br />
		${userBMI.getWeight()} weight <br />
		${userBMI.getBmi()} bmi <br />
	</p>
<a href="index.jsp">Calculate another BMI</a>

</body>
</html>