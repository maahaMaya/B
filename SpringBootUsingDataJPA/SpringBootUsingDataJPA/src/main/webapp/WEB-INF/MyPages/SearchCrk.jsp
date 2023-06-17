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
<h1 style="text-align:center;width:100%">Search Cricketer</h1>
<form method="POST"  action="fetchInfo">
	<p style="text-align:center;width:100%">
		<input type="text"  name="txtCid" placeholder="Enter Criketer Number" />
		<input type="submit"  value="Search" />
	</p>
</form>
<br />
<table width="100%" border="1">
<tr>
<th>Crk ID</th>
<th>Crk Name</th>
<th>Game</th>
<th>Runs</th>
</tr>
<tr>
<td>${crk.crid }</td>
<td>${crk.crkname }</td>
<td>${crk.game }</td>
<td>${crk.runs }</td>
</tr>
</table>
<br />
<h2 style="text-align:center;width:100%">${msg }</h2>
</body>
</html>