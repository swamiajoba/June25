<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   errorPage="MyErrorpage.jsp"  isErrorPage="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
<h1>

			<%   String name=request.getParameter("t1");
					String fruits[] = request.getParameterValues("c1");
			%>
		Name is  <%=name %> Expression tag<br>
		Name is <%out.println(name); %> <br>
		<hr>

			<%
						for(int i=0;i<fruits.length;i++)
						{
							out.println(fruits[i] +"<br>");
						}
			//int x=Integer.parseInt("Zero");

			%>
	</h1>

	--%>
			<hr>


	<h1>Expression Language EL</h1>		
Name is = ${param.t1}
 <br> <br>

Fruits are <br>
${paramValues.c1[0]} <br>
${paramValues.c1[1]} <br>
${paramValues.c1[2]}<br>
${paramValues.c1[3]}<br>












</h1>
</body>
</html>