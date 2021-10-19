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
<% String name=(String)request.getAttribute("name");
String password=(String)request.getAttribute("userpass");

String email=(String)request.getAttribute("useremail");
%>
<!-- <h1>your name is: <%=name %></h1>
<h1>your password is: <%=password %>,keep it secure</h1>
<h1>your email is: <%=email %></h1> -->
<h1 style="color: red;">welcome, ${projectName}</h1>

<h1>user name: ${user.username }</h1>
<h1>password:${user.userpass}</h1>
<h1>email:${user.useremail }</h1>

</body>
</html>