<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>My First JSPL project</title>
</head>

<body>

	<p>
		Date is: ${requestScope.strDate}
		
		<br/>
		
		<c:out value="${strDate}"></c:out>
	</p>

</body>
</html>