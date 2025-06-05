<%@ tag description="Repeats content N times" pageEncoding="UTF-8"%>
<%@ attribute name="count" required="true" type="java.lang.Integer" %>
<%@ tag body-content="scriptless" %>

<%
    for (int i = 0; i < count; i++) {
%>
    <jsp:doBody />
<%
    }
%>
