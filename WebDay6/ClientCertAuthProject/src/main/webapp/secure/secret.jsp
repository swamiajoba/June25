<html>
<body>
<h2>Client Certificate Authenticated!</h2>
<p>Welcome <%= request.getRemoteUser() %></p>
<p>User Principal: <%= request.getUserPrincipal() %></p>
</body>
</html>
