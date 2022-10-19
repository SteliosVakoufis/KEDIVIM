<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Επιτυχής Εισαγωγή</title>
</head>
<body>

    <h2>Teacher inserted succesfully</h2>
    <div>
        <p>${insertedTeacher.lastname}</p>
        <p>${insertedTeacher.firstname}</p>
    </div>
    <div>
        <a href="${pageContext.request.contextPath}/jsps/teachersmenu.jsp">
            Επιστροφή

        </a>
    </div>

</body>
</html>