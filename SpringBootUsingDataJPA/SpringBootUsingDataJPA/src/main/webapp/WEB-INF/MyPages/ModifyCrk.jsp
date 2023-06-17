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
<h1 style="text-align:center;width:100%">Modify Cricketer</h1>
<form method="POST"  action="fetchMod">
	<p style="text-align:center;width:100%">
		<input type="text"  name="txtCid" placeholder="Enter Criketer Number" />
		<input type="submit"  value="Search" />
	</p>
</form>
<br /><br />

<form method="POST"  action="modn">
	<p style="text-align:center;width:100%">

<input type="text" name="txtcid" value="${crk.crid }" readonly />
<br /><br />
<input type="text" name="txtcrName" value="${crk.crkname }" />
<br /><br />
<span style="text-align:center;width:100%">${crk.game }</span>
<select name="ddlGame" >
<option value="-1">Select Game</option>
<option value="Test">Test</option>
<option value="OneDay">OneDay</option>
<option value="T20">T20</option>
</select>
<br /><br />
<input type="text" name="txtruns" value="${crk.runs }" />
<br /><br />
<input type="submit"  value="Modify Cricketer" />
</p>
</form> 
<br />
<h2 style="text-align:center;width:100%">${msg }</h2>
</body>
</html>