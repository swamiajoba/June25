<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bean.MyUser"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Using useBean Tag</h1>
	
	<jsp:useBean id="myUser" class="com.bean.MyUser" scope="page"/>
	<%-- <% MyUser myUser = new MyUser(); %> --%>
	
	<jsp:setProperty property="username" name="myUser" param="user"/>
	<%-- <% myUser.setUsername(request.getParameter("user")); %> --%>
	
	<jsp:setProperty property="password" name="myUser" param="pwd"/>
	<%-- <% myUser.setPassword(request.getParameter("pwd")); %> --%>
	
	<jsp:getProperty property="username" name="myUser"/>
	<%--<%=myUser.getUsername() %> --%>
	
	<jsp:getProperty property="password" name="myUser"/>
	<%--<%=myUser.getPassword() %> --%>
	
	<hr>
	<h2> Using EL </h2>
	Username = ${myUser.username }  <br>
	Password = ${myUser.password }  <br>
	
</body>
</html>