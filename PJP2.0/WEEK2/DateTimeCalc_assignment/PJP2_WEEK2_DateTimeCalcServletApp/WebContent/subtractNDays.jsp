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
	<h1>Subtract N Days from an Input Date</h1>
	<hr>
	<form class="ipForm" id="subtractDays">
		<div class="ipField">
			<label for="date">Input Date:- </label> <input id="date" name="date"
				type="date" min="1979-12-31" max="2020-01-02" required> <br>
		</div>
		<div class="ipField">
			<label for="numOfDays">Number of Days to be subtracted:- </label> <input
				id="numOfDays" name="numOfDays" type="number" min="1" max="30"
				required><br>
		</div>
		<input type="submit">
	</form>
	<br>
	<br>
	<h2>Result</h2>
	<div id="resp"></div>
</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$("#subtractDays").submit(function(e) {
		e.preventDefault();
		$.ajax({
			url : 'subtractNDays',
			data : {
				date : $('#date').val(),
				numOfDays : $('#numOfDays').val()
			},
			success : function(res) {
				$('#resp').text(res);
			}
		});
	});
</script>
</html>