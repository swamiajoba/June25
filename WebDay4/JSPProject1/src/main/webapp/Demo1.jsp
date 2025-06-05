<%@ page import="java.util.Date" %>
<%! 
    public String getGreeting() {
        return "Welcome!";
    }
%>
<%
    String user = request.getParameter("user");
    if (user == null) user = "Guest";
%>
<html>
<body>
    <h1><%= getGreeting() %></h1>
    <p>Hello, <%= user %>. Today is <%= new Date() %></p>
</body>
</html>

<%-- http://localhost:8085/JSPProject1/Demo1.jsp?user=Manjiri --%>
