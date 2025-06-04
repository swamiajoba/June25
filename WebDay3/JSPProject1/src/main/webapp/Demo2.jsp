<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="MyErrorPage.jsp"%>

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