<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>this is about page</p>

<%
List<String> course=(List<String>)request.getAttribute("list");
for(String s:course)
{%>
	<h2 style="color:red;"><%=s  %></h2>
	<% 
}
%>
</body>
</html>