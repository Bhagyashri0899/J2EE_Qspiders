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
	margin-bottom:50px;
	margin-top: 40px;
	text-align: left;
}
fieldset {
	margin: 150px 520px;
	text-align: center;
	background-color: olive;
	box-shadow: 8px 8px black;
}
legend {
	color: white;
	background-color: black ;
}
body {
	background: url(./image/image1.jpg);
    background-size: cover;
	background-size: 100%;
	margin: 0 auto;
}
</style>
</head>
<body>

	
	<fieldset>
		<legend>Login to proceed</legend>
		<form action="./StudentDetails.jsp" method="post">
			<table>
				<tr>
					<td>Username :</td>
					<td><input type="text" name="username" placeholder="UserName"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" placeholder="Password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>