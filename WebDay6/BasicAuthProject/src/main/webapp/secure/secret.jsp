<%@ page language="java" %>
<%@ page session="false" %>
<html>
<head><title>Secret Page</title></head>
<body>
    <h1>Welcome, <%= request.getRemoteUser() %>!</h1>
    <p>You have accessed a protected resource.</p>
</body>
</html>
