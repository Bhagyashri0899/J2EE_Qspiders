<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form action="./StudentDetails.jsp" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Contact:</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="city"></td>
				</tr>
				
				
				
				<tr>
					<td><input type="submit" name="SEND"></td>
				</tr>
				
			</table>
		</form>
</body>
</html>