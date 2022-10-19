<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Teacher Update</title>
</head>
<body>
    <div>
        <form method="POST" action="${pageContext.request.contextPath}/update">
            <input type="text" name="id" value="${teacher.id}"><br>
            <input type="text" name="firstname" value="${teacher.firstname}"> <br>
            <input type="text" name="lastname" value="${teacher.lastname}"> <br><br>
            <button type="submt">Update Teacher</button>
        </form>
    </div>
</body>
</html>