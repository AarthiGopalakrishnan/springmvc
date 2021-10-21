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

<!--expression tag is used to print value of variable and method-->

<c:forEach var="i" items="${userlist}">
<h1 style="color:brown;">user name: <c:out value="${i.username}"></c:out>
</h1>
<h1 style="color:blue;">user email:<c:out value="${i.useremail}"></c:out></h1>
</c:forEach>


</body>
</html>