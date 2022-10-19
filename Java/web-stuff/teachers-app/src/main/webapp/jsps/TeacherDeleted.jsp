<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Teacher delete?id</title>
</head>
<body>
    <p>
        Teacher: ${teacher.id}.${teacher.firstname}.${teacher.lastname} was deleted
    </p>
    <a href="${pageContext.request.contextPath}/jsps/teachersmenu.jsp">
        Επιστροφή
    </a>
</body>
</html>