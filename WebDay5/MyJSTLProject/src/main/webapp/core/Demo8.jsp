<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>forTokens Tag Example</title>
   </head>

   <body>
      <c:forTokens items = "Zara,nuha,roshy" delims = "," var = "name">
        <p> <c:out value = "${name}"/></p>
      </c:forTokens>
   </body>
</html>