<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
<style type="text/css">

fieldset {
	margin: 15px 520px;
	text-align: center;
}
legend {
	color: white;
	background-color: #333;
}
ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: navy;
}
li {
	float: right;
	border-bottom: none;
}
li a {
	display: block;
	margin: 0px;
	padding: 15px;
}
li a:hover {
	background-color: fuchsia;
}

body {
	background-color:rgba(70, 10, 12, 0.5);
	background-size: 100%;
}
</style>
</head>
<body>
	<ul>
		<li><a style="color: white;" href="./logout">Logout</a></li>
		<li><a style="color: white;" href="./search">Search Student</a></li>
		<li><a style="color: white;" href="./add">Add Student</a></li>
		<li><a style="color: white;" href="./update">Update Student</a></li>
		<li><a style="color: white;" href="./remove">Remove Student</a></li>
		<li><a style="color: white;" href="./home">Home</a></li>
	</ul>
</body>
</html>