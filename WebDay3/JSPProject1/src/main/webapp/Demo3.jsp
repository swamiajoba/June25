<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%-- RequestDispatcher   forward --%>
    <%--
    <jsp:forward page="Demo3_1.jsp">
    	<jsp:param value="admin@abc.com" name="adminemail"/>
    </jsp:forward>
    --%>
    
    <%--RequestDispatcher include --%>
     <jsp:include page="Demo3_1.jsp">
    	<jsp:param value="admin@abc.com" name="adminemail"/>
    </jsp:include>
    
    <hr>
    <font color="green" size="5">
    	This is Demo3.jsp
    </font>