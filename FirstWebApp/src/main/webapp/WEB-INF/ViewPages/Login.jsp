<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="f1"  method="POST"  action="loginprocess">
<p style="text-align: center;width:100%">
	<input type="text"  name="txtUser"  placeholder="Username" />
	<br /><br />
	<input type="password" name="txtPwd" placeholder="Password" />
	<br /><br />
	<input type="submit"  value="Click Me" />
</p>
</form>
<h1>${msg }</h1>
</body>
</html>