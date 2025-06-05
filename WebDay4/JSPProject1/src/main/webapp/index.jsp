  <%--Directive  --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.time.LocalDateTime"%>
  <%--Declaration  --%>
  <%!  int res=0;
	public int add (int a,int b) {
		return a+b;
	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%--Scriplets  --%>
<% LocalDateTime dt=LocalDateTime.now();  %>
<% out.println(dt); 
	res=add(4,6);
	%>
<hr>
  <%--Expression  --%>
Expression <br>
<%=dt %>  <br>
<%=res %>
</body>
</html>