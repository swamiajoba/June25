<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>import Tag Example</title>
   </head>

   <body>
      <c:import var = "data" url = "http://jsonplaceholder.typicode.com/users"/>
      <c:out value = "${data}"/>
   </body>
</html>