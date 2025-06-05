<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="ct" uri="http://customtags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Custom Tag with no attribute and no body</h2>
<ct:simple/>

<h2>Custom Tag with attribute and no body</h2>
<ct:attribute message="Welcome to the custom tag with attribute"/> 
<h2>Tag with multiple attribute</h2>
<ct:gst amount="10000.00" percent="0.05"/>
<ct:gst amount="143000.00" percent="0.18"/>

<h2>Tag with only body</h2>
<ct:bodyOnly>This is a Text body content  </ct:bodyOnly>

<h2>Tag with attribute and body</h2>
<ct:attrBody prefix="WARNING">You have used non generic collection</ct:attrBody>

<h2>Tag with multiple attribute and body</h2>
<ct:formatText bold="true" underline="true">Manjiri Tatke</ct:formatText><br>
<ct:formatText bold="true" underline="false">Manjiri Tatke</ct:formatText> <br>
<ct:formatText bold="false" underline="true">Manjiri Tatke</ct:formatText> <br>

</body>
</html>








