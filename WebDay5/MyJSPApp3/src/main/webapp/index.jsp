<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Using Custom Tag</h2>
    <my:hello />
 <h2>Using Custom tag with attribute</h2>
 	<my:welcome name="Manjiri"/>
 <h2>Using Custom tag with body</h2>
   <my:box>
        This content is inside the custom box tag.
    </my:box>
 <h2>Tag with iteration logic</h2>
   <my:repeat count="3">
        <p>This is repeated.</p>
    </my:repeat>
  <h2>Tag with if logic </h2>
   <my:if test="<%= 10 > 5 %>">
        <p>Condition is true, so this is displayed.</p>
    </my:if>
</body>
</html>