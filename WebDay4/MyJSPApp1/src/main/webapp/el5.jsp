<%@page import="com.bean.Counter1" %>

<html>
<head>
    <title>Registration Form </title>
 </head>
 <body>
    <h1> Registration Form </h1>

    <form method="post" action="RegServlet1" >
    <pre>
    Enter your name         <input type="text" name="user" value="${param.user}">
    Enter your hobbies      <input type="checkbox" name="hobbies" value="Reading"> Reading
                            <input type="checkbox" name="hobbies" value="Writing"> Writing
                            <input type="checkbox" name="hobbies" value="Swimming"> Swimming
                            <input type="checkbox" name="hobbies" value="Travelling"> Travelling

     Gender                 <input type="radio" name="gender" value="Male"> Male
                            <input type="radio" name="gender" value="Female"> Female

      Electric Items        <input type="checkbox" name="items" value="Freeze"> Freeze
                            <input type="checkbox" name="items" value="TV"> TV
                            <input type="checkbox" name="items" value="Oven"> Oven
                            <input type="checkbox" name="items" value="Mixer"> Mixer

       <input type="submit" value="Register">
    </pre>
    </form>
    <hr>
    <font color="red" size=5>
    ${requestScope.errmsg }
    </font>
    <br>
    <jsp:useBean id="ob" class="com.bean.Counter1" scope="application"/>

 </body>
 </html>