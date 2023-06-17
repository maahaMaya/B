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
<h1 style="text-align:center;width:100%">Add New Cricketer</h1>
<form method="POST" action="addn">
<p style="text-align:center;width:100%">
<input type="text" name="txtcrName" placeholder="Cricketer Name" />
<br /><br />
<select name="ddlGame">
<option value="-1">Select Game</option>
<option value="Test">Test</option>
<option value="OneDay">OneDay</option>
<option value="T20">T20</option>
</select>
<br /><br />
<input type="text" name="txtruns" placeholder="No of Runs" />
<br /><br />
<input type="submit"  value="Add Cricketer" />
</p>
</form>
<h2>${msg }</h2>
</body>
</html>