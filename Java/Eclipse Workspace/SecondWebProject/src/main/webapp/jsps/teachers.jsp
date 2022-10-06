<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Teachers!!</title>
</head>

<body>
	<table>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach var="teacher" items="${teachers}">
		<tr>
			<td>${teacher.id}</td>
			<td>${teacher.firstname}</td>
			<td>${teacher.lastname}</td>
		</tr>
		</c:forEach>
	</table>
</body>

</html>