<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>forEach Tag Example</title>
   </head>

   <body>
      <c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
      </c:forEach>
      <hr>
      <c:forEach var = "i" begin = "0" end = "50" step="10">
         Item <c:out value = "${i}"/><p>
      </c:forEach>
      <hr>
      
      
   </body>
</html>