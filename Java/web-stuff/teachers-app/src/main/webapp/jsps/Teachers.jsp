<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/teachers.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <div>
        <table>
            <thead>
                <tr><th>First Name</th>
                    <th>Last Name</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach var = "teacher" items ="${teachers}">
                    <tr>
                        <td>$${teacher.id}</td>
                        <td>$${teacher.Firstname}</td>
                        <td>$${teacher.Lastname}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/delete?id=${teacher.id}&
                                        firstname = ${teacher.firstname} & lastname = ${teacher.lastname} ">
                                        Delete
                            </a>
                        </td>

                        <td>
                            <a href="${pageContext.request.contextPath}/update?id=${teacher.id}&
                                        firstname = ${teacher.firstname} & lastname = ${teacher.lastname} ">
                                        Update
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div>
        <c:if test="${deleteAPIError}">
            <p>Something went wrong with Delete</p>
        </c:if>
    </div>

    <div>
        <c:if test="${sqlError}">
            <p>Error in SQL Update</p>
        </c:if>
    </div>
    
</body>
</html>