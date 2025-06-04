<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form!</h1>
        <pre>
        <form action="LoginServlet.do" method="post">
            Enter Username      <input type="text" name="user" required="true">
            Enter Password      <input type="password" name="pass" required="true">
            <input type="submit" value="Login">
        </form>
        </pre>
    </body>
</html>
