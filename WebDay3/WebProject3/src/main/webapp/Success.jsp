<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String semail =(String) request.getAttribute("myemail"); %>
<h2> Email is <%=semail %>
<hr>
<%String us=(String) session.getAttribute("user_name"); %>
<h1>Session logged in user is <%=us%> </h1>
<hr>
<a href="index.jsp">Go to home</a>
</body>
</html>