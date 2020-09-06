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
	<h1>Get the Day Of The Week of an Input Date</h1>
	<hr>
	<form class="ipForm" method="post" action="/dayOfWeek">
		<div class="ipField">
			<label for="date">Input Date:- </label> <input id="date" name="date"
				type="date" min="1979-12-31" max="2020-01-02" required> <br>
		</div>
		<input type="submit">
	</form>
	<br>
	<br>
	<h2>Result</h2>
	<div id="resp">${result}</div>
</body>

</html>