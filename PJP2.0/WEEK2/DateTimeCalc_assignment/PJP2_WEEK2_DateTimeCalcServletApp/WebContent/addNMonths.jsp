<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add N Months to an Input Date</h1>
<form action="addNMonths">

<label for="date">Input Date:- </label>
<input id="date" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
<label for="numOfMonths">Number of Months to be Added:- </label>
<input id="numOfMonths" name="numOfMonths" type="number" min="1" max="30" required><br>
<input type="submit">

</form>
<h2>Result:-  ${opDate}</h2>
</body>
</html>