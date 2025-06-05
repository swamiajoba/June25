<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>Click the button to start async processing:</h2>
    <form action="async" method="get">
        <button type="submit">Start Async Task</button>
    </form>
    <hr>
    Asynchronous Servlet bringing delayed response.
    Request is not blocked
    <hr>
    <a href="one.html">Go to one.html</a>
</body>
</html>