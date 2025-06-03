<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	Cookie cookies[] = request.getCookies();
	String mycolor="white";
	
	if(cookies!=null){
		for(Cookie c: cookies) {
			out.println("Key "+c.getName() +", value "+c.getValue() + "<br>");
			if(c.getName().equals("bgc")) {
				mycolor=c.getValue();
			}
		}
	}
%>

<body bgcolor=<%=mycolor %>>
	<%String us=(String) session.getAttribute("user_name"); %>
	<h1>Welcome  <%=us %></h1>
	
	<%if(us==null) { %>
		<a href="Login.jsp">Login</a> <br>
	<%} %>
	
	<%if(us!=null) { %>
		<a href="LogoutServlet">Logout</a> <br>
	<%} %>
	<hr>
	<a href="Pesonalize.jsp">Pesonalize your web site</a>
	
	<hr>
	<% if(us!=null) { %>
		<a href="ProductForm.jsp">Insert Products</a> <br>
		<a href="MyProductlist.jsp">View all products</a>
	<%} %>
	
</body>

</html>