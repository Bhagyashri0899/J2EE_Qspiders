<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
<style type="text/css">
form {
	margin-top: 10px;
}
form table {
	margin: auto;
	width: 100%;
}
tr {
	text-align: center;
}
fieldset table {
	margin: auto;
	text-align: left;
}
fieldset {
	margin: 15px 520px;
	text-align: center;
	background-color: rgb(255, 178 ,102);
}
legend {
	color: white;
	background-color: #333;
}
body {
    background: url(./image/image1.jpg);
	background-size: 100%;
}
#data {
	background-color: silver;
	border: 1px solid black;
	width: 100%;
	border: 1px solid black;
}
#data td {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
  
	<fieldset>
		<legend>Select Student</legend>
		<form action="./StudentDetails.jsp" method="post">
			<table>
				<tr>
					<td>Enter Student id :</td>
					<td><input type="text" name="id" placeholder="Enter ID"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Remove"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	
	<fieldset style="width: auto; margin: 0%;">
		<legend>Student Details</legend>
		<table id="data">
			<tr>
				<td>
					<h3>ID</h3>
				</td>
				<td>
					<h3>Name</h3>
				</td>
				<td>
					<h3>Email</h3>
				</td>
				<td>
					<h3>Contact</h3>
				</td>
				<td>
					<h3>City</h3>
				</td>
				<td>
					<h3>Username</h3>
				</td>
				<td>
					<h3>Password</h3>
				</td>
			</tr>
			
					</table>
	</fieldset>
	
</body>
</html>