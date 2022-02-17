<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!-- c:out ; c:forEach ; c:if -->
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!-- form:form -->
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!-- for rendering errors on PUT routes -->
            <%@ page isErrorPage="true" %>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="UTF-8">
                    <title>Full CRUD Save Travels</title>
                    <link rel="stylesheet"
                        href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
                        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
                        crossorigin="anonymous">
                    <link rel="stylesheet" type="text/css" href="/css/style.css">
                    <script type="text/javascript" src="/js/app.js"></script>
                </head>

                <body class="container text-center">
                    <div class="container">

                        <form:form action="/expenses/update/${expense.id}" method="post" modelAttribute="expense"
                            class="container m-4">
                            <input type="hidden" name="_method" value="put">
                            <h1>Edit Expenses</h1>
                    


                            <div class="mb-3">
                                <form:label path="name" class="form-label">Expense Name:</form:label>
                                <form:errors path="name" class="text-danger" />
                                <form:input path="name" class="form-control" />
                            </div>
                            <div class="mb-3">
                                <form:label path="vendor" class="form-label">Vendor:</form:label>
                                <form:errors path="vendor" class="text-danger" />
                                <form:input path="vendor" class="form-control" />
                            </div>
                            <div class="mb-3">
                                <form:label path="amount" class="form-label">Amount:</form:label>
                                <form:errors path="amount" class="text-danger" />
                                <form:input path="amount" type="number" step="0.01" class="form-control" />
                            </div>
                            <div class="mb-3">
                                <form:label path="description" class="form-label">Description:</form:label>
                                <form:errors path="description" class="text-danger" />
                                <form:textarea path="description" class="form-control" rows="3" />
                            </div>
                            <input type="submit" class="btn btn-dark" value="Submit"/>
                            <div>
                                <a href="/expenses" class="btn btn-dark">Home</a>
                                <a href="/expenses/delete/${id}" class="btn btn-dark">Delete</a>
                                <a href="/expenses/view/${id}" class="btn btn-dark">View</a>
    
                            </div>
                          
                        </form:form>
                  
                       
                      
                     


                    </div>
                </body>

                </html>