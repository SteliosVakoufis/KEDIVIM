<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/teachersmenu.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <div class="center">
        <div class="search-wrapper">

            <div class="bot-gap">
                <span class="title">Teachers Search</span>
            </div>

            <div class="bot-gap">
                <form method="GET" action="${pageContext.request.contextPath}/search">
                    <input type="text" name="lastname" id="lastname" class="search rounded" placeholder="insert teacher's lastname" autofocus>
                    <br><br>
                    <button type="submt" class="search-btn rounded color-btn">Search</button>
                </form>
            </div>

        </div>
        <div class="insert-wrapper">
            <div class="bot-gap">
                <span class="title">Teachers Insert</span>
            </div>

            <div class="bot-gap">
                <form method="GET" action="${pageContext.request.contextPath}/insert">
                    <input type="text" name="lastname" id="lastname" class="insert rounded" required placeholder="Lastname" autofocus><br>
                    <input type="text" name="firstname" id="firstname" class="insert rounded" required placeholder="Firstname" autofocus>
                    <br><br>
                    <button type="submt" class="search-btn rounded color-btn">Insert</button>
                </form>
            </div>
        </div>
    </div>

    <div class="center">
        <c:if test="${sqlError}">
            <p>Error in Insert</p>
        </c:if>
    </div>

    <div class="center">
        <c:if test="${teacherNotFound}">
            <p>Error in Insert</p>
        </c:if>
    </div>

</body>
</html>
