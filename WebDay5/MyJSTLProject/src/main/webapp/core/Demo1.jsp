<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <p>Before Remove Value: <c:out value = "${salary}"/></p>
         <c:remove var = "salary"/>
      <p>After Remove Value: <c:out value = "${salary}"/></p>
      

</body>
</html>