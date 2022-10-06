<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<%!
	public Date getDate() {
		return new Date();
	}
%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>My First JSP Page</title>
</head>

<body>

    <%= getDate() %>
    
</body>

</html>
