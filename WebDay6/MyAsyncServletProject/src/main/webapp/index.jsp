<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="AsyncLongRunningServlet?time=8000"> 
		Calling Asynchronous Servlet with time 8000 ms
	</a>
	<hr>
	<a href="AsyncLongRunningServlet?time=9999"> 
		Calling Asynchronous Servlet with time 9999 ms
	</a>

	<hr>
	Asynchronous Servlet bringing delayed response.
    Request is not blocked
    <hr>
    <a href="one.html">Go to one.html</a>
</body>
</html>