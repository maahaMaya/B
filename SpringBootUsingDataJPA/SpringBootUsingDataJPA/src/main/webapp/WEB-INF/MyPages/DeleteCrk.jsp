<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr />
<p style="text-align:center;width:100%">
	<a href="add">Add New Cricketer</a> 
	&nbsp;&nbsp;|&nbsp;&nbsp;
	<a href="vall">View All Cricketers</a> 
	&nbsp;&nbsp;|&nbsp;&nbsp;
	<a href="search">Search Cricketer</a> 
	&nbsp;&nbsp;|&nbsp;&nbsp;
	<a href="mod">Modify Cricketer</a> 
	&nbsp;&nbsp;|&nbsp;&nbsp;
	<a href="del">Delete Cricketer</a> 
	&nbsp;&nbsp;|&nbsp;&nbsp;
</p>
<hr />
<h1 style="text-align:center;width:100%">Delete Cricketer</h1>
<form method="POST"  action="delInfo">
	<p style="text-align:center;width:100%">
		<input type="text"  name="txtCid" placeholder="Enter Criketer Number" />
		<input type="submit"  value="Delete" />
	</p>
</form>
<br />

<h2 style="text-align:center;width:100%">${msg }</h2>
</body>
</html>