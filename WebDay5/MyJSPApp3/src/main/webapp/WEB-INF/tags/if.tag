<%@ tag description="Simple IF condition" pageEncoding="UTF-8"%>
<%@ attribute name="test" required="true" type="Boolean" %>
<%@ tag body-content="scriptless" %>

<%
    if (test) {
%>
    <jsp:doBody />
<%
    }
%>
