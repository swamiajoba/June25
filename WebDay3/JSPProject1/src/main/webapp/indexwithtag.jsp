  <%--Directive  --%>
<jsp:directive.page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.time.LocalDateTime"  />

  <%--Declaration  --%>
  <jsp:declaration>
    int res=0;
	public int add (int a,int b) {
		return a+b;
	}
 </jsp:declaration>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%--Scriplets  --%>
  <jsp:scriptlet>
 LocalDateTime dt=LocalDateTime.now();  
 out.println(dt); 
	res=add(8,6);
	</jsp:scriptlet>
	
<hr>
  <%--Expression  --%>
Expression <br>
<jsp:expression> dt </jsp:expression>  <br>
<jsp:expression> res </jsp:expression>
</body>
</html>