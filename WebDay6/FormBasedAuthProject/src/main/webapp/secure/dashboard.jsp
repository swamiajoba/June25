<%@ page session="true" %>
<html>
<head><title>Dashboard</title></head>
<body>
    <h2>Welcome, <%= request.getRemoteUser() %></h2>
    <p>You have successfully logged in!</p>
    <p>This is a secure page.</p>
</body>
</html>
