<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<h1 style="text-align:center;width:100%">View All Cricketers</h1>
<table width="100%" border="1">
<tr>
<th>Crk ID</th>
<th>Crk Name</th>
<th>Game</th>
<th>Runs</th>
</tr>
<c:forEach var="crk" items="${call }">
	<tr>
	<td>${crk.crid }</td>
	<td>${crk.crkname }</td>
	<td>${crk.game }</td>
	<td>${crk.runs }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>