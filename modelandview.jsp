<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %> 

<!-- jstl=jsp standard tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- 
<% 
String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("id");
%> 
-->

<h1>The name is:${name}</h1>
<h1>The id is:${id}</h1>
<h1> Marks:${marks}</h1>

<c:forEach var="i" items="${marks}">
<h1 style="color:brown;"><c:out value="${i}"></c:out>
</h1>

</c:forEach>


</body>
</html>