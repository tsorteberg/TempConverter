<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Converter</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<form action="getTempServlet" method="post">
		<p>Enter the temperature you wish to convert:</p>
		<input type="text" name="userTemp" size="10">
		<select name="userScaleInitial">
	    	<option value="F">Fahrenheit</option>
	    	<option value="C">Celsius</option>
	    	<option value="K">Kelvin</option>
	    </select><br><br>
	    <label for="userScaleFinal">To scale:</label>
	  	<select name="userScaleFinal">
	    	<option value="F">Fahrenheit</option>
	    	<option value="C">Celsius</option>
	    	<option value="K">Kelvin</option>
	    </select><br><br>
	    <input type="submit" value="Calculate Temperature" />
	</form>
</body>
</html>