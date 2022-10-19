<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <p%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

        <!DOCTYPE html>

        <html>

        <head>
            <meta charset="UTF-8">

            <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/login.css">

            <title>Login</title>
        </head>

        <body>

            <div class="container-fluid">

                <div class="container">
                    <div class="row">
                        <h1>Login</h1>
                    </div>

                    <form action="${pageContext.request.contextPath}/login" methods="POST">
                        <div class="row">
                            <input type="email" name="email" placeholder="Email" required>
                        </div>

                        <div class="row">
                            <input type="password" name="password" placeholder="Password" required>
                        </div>

                        <div class="row">
                            <button type="submit">Sign In</button>
                        </div>
                    </form>
                    <div class="row text-grey">
                        <a href="#">Lost your password?</a>
                    </div>
                </div>

                
                <div class="row">
                    <p>
                        Don't have an account?
                        <a href=""></a>
                    </p>
                </div>

            </div>
            <div class="container-error">
                <c:if test="${error}">
                    <p>Login Error</p>
                </c:if>
            </div>

        </body>

        </html>