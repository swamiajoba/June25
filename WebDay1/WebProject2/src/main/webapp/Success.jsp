<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bean.MyUser"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
MyUser user=(MyUser)request.getAttribute("userobject");

%>
<h1>Welcome  <%= user.getUsername() %></h1>

</body>
</html>