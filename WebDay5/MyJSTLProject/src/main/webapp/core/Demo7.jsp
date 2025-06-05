<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false" errorPage="MyErrorPage.jsp"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

    <h2> Using EL (Expression Language)</h2>
    Name is = ${param.user}
 <br> <br>

Fruits are <br>
${paramValues.c1[0]} <br>
${paramValues.c1[1]} <br>
${paramValues.c1[2]}<br>
${paramValues.c1[3]}<br>
${paramValues.c1[4]}<br>
<hr>
<c:if test="${paramValues.c1!=null}">
	<c:forEach var="fruit" items="${paramValues.c1}"> 
		Fruit is ${fruit} <br>
	</c:forEach>
</c:if>
 
    
    
    