<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DateTime Calculator</title>
<link rel="stylesheet" type="text/css" href="css/inputType1.css">
</head>
<body>
	<h1>Add N Weeks to an Input Date</h1>
	<hr>
	<form class="ipForm" action="/addNWeeks" method="post">
		<div class="ipField">
			<label for="date">Input Date:- </label> <input id="date" name="date"
				type="date" min="1979-12-31" max="2020-01-02" required> <br>
		</div>
		<div class="ipField">
			<label for="numOfWeeks">Number of Weeks to be Added:- </label> <input
				id="numOfWeeks" name="numOfWeeks" type="number" min="1" max="30"
				required><br>
		</div>
		<input type="submit">
	</form>
	<br>
	<br>
	<h2>Result</h2>
	<div id="resp">${result}</div>
</body>

</html>