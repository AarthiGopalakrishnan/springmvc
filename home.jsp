<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome to spring mvc</h2>
<h3>this page is called by /home url</h3>


<!-- scriptlet tag is used to write java code-->
<%
String name=(String)request.getAttribute("username");
Integer id=(Integer)request.getAttribute("id");


%>
<!--expression tag is used to print value of variable and method-->
<h3 style="color:blue;">the name is : <%=name %></h3>
</body>
</html>