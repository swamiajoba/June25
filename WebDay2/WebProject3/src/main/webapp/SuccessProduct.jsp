<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bean.Product"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Success. Product is inserted</h1>
<%  Product p=(Product) request.getAttribute("pr");  %>
<h2>
Product ID <%= p.getPid() %>  <br>
Product Name <%= p.getPname() %><br>
Product Price<%= p.getPrice() %><br>
</h2>
<hr>
<a href="ProductForm.jsp"> Add More Products</a> <br>
<a href="index.jsp">Go to Home</a>

</body>
</html>