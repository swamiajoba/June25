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
	<jsp:useBean id="counter" class="com.bean.Counter" scope="request"/>
		<jsp:setProperty name="counter" property="count"/>  
		<jsp:getProperty property="count" name="counter"/>
		
						<hr>
		Count is ${requestScope.counter.count }

		<%--
			<%
				Counter counter= (Counter) requet.getAttribute("counter");
				counter.setCount(101);
				counter.getCount();  // 102
			request.setAttribute("counter",counter);
			
			%>
		
		 --%>
	
</body>
</html>










