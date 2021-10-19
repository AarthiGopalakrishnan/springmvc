<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;">welcome, ${projectName}</h1>
<form action="processform" method="post">
<table>
<tr>
<td>
Enter your name: </td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Enter your password:</td>
<td><input type="password" name="userpass"></td>
</tr>
<tr>
<td>Enter your email:</td>
<td><input type="email" name="useremail"></td>
<tr><td>
<button type="submit">Register</button></td>
</tr>
</table>

</form>
</body>
</html>