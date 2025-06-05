<%@page import="java.util.List,com.bean.RegisterUser" %>

<h1> User Details <h1>
<h2>
User is ${sessionScope.myuser.user}  <br> <br>

Hobbies
${sessionScope.myuser.hobbies[0]} <br>
${sessionScope.myuser.hobbies[1] }<br>
${sessionScope.myuser.hobbies[2]} <br>
${sessionScope.myuser.hobbies[2]} <br><br>

Gender
${sessionScope.myuser.gender} <br><br>

Items
${sessionScope.myuser.items[0]} <br>
${sessionScope.myuser.items[1] }<br>
${sessionScope.myuser.items[2] }<br>
${sessionScope.myuser.items[3] }<br><br>

Extra information
User email  ${sessionScope.myuser.props["useremail"] } <br>

Token  ${sessionScope.myuser.props.token } <br>


</h2>

<h2> Count in application scope </h2>
${applicationScope.ob.count }

