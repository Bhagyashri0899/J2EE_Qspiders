<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
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
	margin: 150px 520px;
	text-align: center;
	box-shadow: 8px 8px black;
	background-color: olive;
}
legend {

	color: white;
	background-color: #336;
}
body {
	background: url(./image/image2.jpg);
    background-size: cover;
	background-size: 100%;
	
}
</style>
</head>
<body>
	<fieldset>
		<legend>Student Form</legend>
		<form action="./StudentDetails.jsp" method="post">
			<table>
			<tr>
					<td><label>Id</label></td>
					<td><input type="text" name="id" placeholder="Enter Id"></td>
					 
				</tr>
				<tr>
					<td><label>Name</label></td>
					<td><input type="text" name="name" placeholder="Enter Name"></td>
					 
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="text" name="email" placeholder="Enter Email"></td>
				</tr>
				<tr>
					<td><label>Mobile</label></td>
					<td><input type="text" name="mobile" placeholder="Enter Contact"></td>
				</tr>
				<tr>
					<td><label>Username</label></td>
					<td><input type="text" name="username" placeholder="Enter UserName"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="text" name="password" placeholder="Enter Password"></td>
				</tr>
				
				<tr>
					<td><input type="submit" name="Submit" ></td>     
				</tr>
				
			</table>
		</form>
	</fieldset>
	
</body>
</html>