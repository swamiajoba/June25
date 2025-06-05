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
	<jsp:useBean id="counter" class="com.bean.Counter" scope="application"/>
		<jsp:setProperty name="counter" property="count"/>  
		<jsp:getProperty property="count" name="counter"/>
		
				<hr>
		Count is ${applicationScope.counter.count }

		<%--
			<%
				Counter counter= (Counter) application.getAttribute("counter");
				if(count==null) {
					counter=new Counter();
					counter.setCount(0));
					counter.getCount(); // 1
				}
				else {
					cunter.setCount(previous count);
					counter.getCount();
							
				}
			
			application.setAttribute("counter",counter);
			
			%>
		
		 --%>
	
</body>
</html>










