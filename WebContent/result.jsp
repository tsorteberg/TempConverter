<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Results</title>
</head>
<body>
	<h1>Temperature Results</h1>
	<p>
		Initial Temperature: ${String.format("%.2f", tempObject.getUserTempInitial())}${tempObject.getUserScaleInitial()}<br><br>
		Final Temperature: ${String.format("%.2f", tempObject.getUserTempFinal())}${tempObject.getUserScaleFinal()}<br><br>
		<a href="index.jsp">Convert another temperature.</a>
	</p>
</body>
</html>