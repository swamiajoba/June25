<jsp:directive.page import="com.bean.MyUser"/>
<html>
<body>

<%-- using JSP std tags--%>
<jsp:useBean id="a" class="com.bean.MyUser" scope="page" />
<h2> setting all properties </h2>
<jsp:setProperty name="a" property="*" />


 <hr>
 <h2> EL syntax </h2>
 name: <h3>${a.uid}</h3>
 password:<h3>${a.password}</h3>

 </body>
 </html>
 
 
 
 
 
 
 
 
 