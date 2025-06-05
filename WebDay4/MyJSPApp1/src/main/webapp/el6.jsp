<h1> Context Init parameter </h1>

<h2> Using scriptlets </h2>
<%=application.getInitParameter("Country") %> <br>
<%=application.getInitParameter("Company") %> <br>

<h2> Using EL </h2>
${initParam.Country } <br>
${initParam["Company"] } <br>

<h2> Request header </h2>

  <p>${header["user-agent"]}</p>
  <p>. ${header.accept} or ${header["Accept"]}</p>
  <p>${header["Accept-Encoding"]} </p>
