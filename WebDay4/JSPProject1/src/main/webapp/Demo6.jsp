<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.bean.Counter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Page Scope Count</h1>
	<jsp:useBean id="counter" class="com.bean.Counter" scope="page"/>
		<%-- <% Counter counter=new Counter(); %> --%>
		<jsp:setProperty name="counter" property="count"/>  
		<%-- <% counter.setCount(0); %> --%>
		
		<jsp:getProperty property="count" name="counter"/>
		<%-- <%=counter.getCount() %> --%>
		<hr>
		Count is ${counter.count }
	
</body>
</html>










