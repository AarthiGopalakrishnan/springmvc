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


<h1 style="color: red;">${projectName}</h1>
<form action="updateform" method="post">

<h1>user name:</h1>

<input type="text" name="username">
<h1>user email:</h1>

<input type="text" name="useremail">

<h1>user password:</h1>

<input type="text" name="userpass">

<button type="submit" name="update">Update</button></form>
<form action="deleteform" method="post">
<h1>user name:</h1>

<input type="text" name="username">
<button type="submit" name="delete">Delete</button>
</form>
</body>
</html>