<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String date = (String) request.getAttribute("strDate");
		String name = (String) request.getAttribute("name");
		String surname = (String) request.getAttribute("surname");
		
		out.write("Welcome " + name + " " + surname + "<br>");
	%>

	<h2>Date is: <%=date%></h2>


</body>
</html>