<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Insert title here</title>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
                    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                    crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    <div class="row">
                        <div class="col">
                                <h1>Register</h1>
                                <form:form action="" method="post" modelAttribute="newUser">
                                    <p>
                                        <form:label path="userName">Name</form:label>
                                        <form:errors path="userName" />
                                        <form:input path="userName" class="form-control"/>
                                    </p>
                                    <p>
                                        <form:label path="email">Email</form:label>
                                        <form:errors path="email" />
                                        <form:input path="email" type="email" class="form-control"/>
                                    </p>
                                    <p>
                                        <form:label path="password">Password</form:label>
                                        <form:errors path="password" />
                                        <form:input path="password" type="password" class="form-control"/>
                                    </p>
                                    <p>
                                        <form:label path="confirm">Pages</form:label>
                                        <form:errors path="confirm" />
                                        <form:input type="password" path="confirm" class="form-control"/>
                                    </p>
                                    <input type="submit" value="Submit" class="btn-dark"/>
                                </form:form>


                        </div>
                        <div class="col"></div>
                    </div>

                </div>

            </body>

            </html>