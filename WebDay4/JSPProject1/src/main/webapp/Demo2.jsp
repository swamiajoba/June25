<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="MyErrorPage.jsp"%>
<%-- 
    <%
    	String name=request.getParameter("user");
    
    	String fruits [] = request.getParameterValues("c1");
    
    %>
    <h1> Name : <%=name %></h1>
    
    <h2>Fruits you like </h2>
    <%
    	for(String fruit:fruits) {
    		out.println("<h3>"+fruit+"</h3>");
    	}
    %>
    
    --%>
    <h2> Using EL (Expression Language)</h2>
    Name is = ${param.user}
 <br> <br>

Fruits are <br>
${paramValues.c1[0]} <br>
${paramValues.c1[1]} <br>
${paramValues.c1[2]}<br>
${paramValues.c1[3]}<br>
${paramValues.c1[4]}<br>
    
    
    
    