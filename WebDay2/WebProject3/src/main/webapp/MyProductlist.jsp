<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.bean.Product"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<h1>Displaying Prodct list in jsp</h1>
<%  List<Product> myplist= (List<Product>)application.getAttribute("prlist");
if(myplist !=null ) {
out.println("<h1>");
for(Product p:myplist) {
	out.println(p + "<br>");
}
out.println("</h1>");
}   %>
<a href="index.jsp">Go to Home</a>
</body>
</html>