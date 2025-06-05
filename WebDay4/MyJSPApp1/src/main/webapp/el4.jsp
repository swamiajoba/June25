<h1>Setting cookie in  JSP</h1>
<%
Cookie ck=new Cookie("bgc","ffccee");
response.addCookie(ck);
%>
<a href="el4_1.jsp">click</a>