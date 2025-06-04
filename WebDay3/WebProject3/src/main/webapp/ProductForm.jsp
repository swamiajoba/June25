<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Product Form</h1>
<form method="post" action="ProductServlet">
Entrer Product id <input type="number"  name="pid" min=1 required> <br>
Enter Product Name <input type="text" name="pname" required> <br>
Enter Price   <input type="text" name="price" required ><br>
<input type="Submit" value="Insert Product"> <br>
</form>

</body>
</html>