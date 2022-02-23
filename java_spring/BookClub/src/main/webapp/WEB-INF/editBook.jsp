<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
 <div class="container">

      

<form:form action="/books/update/${editDetailsForm.id}" method="post" modelAttribute="editDetailsForm">
    <input type="hidden" name="_method" value="put"> 

    <form:input type="hidden" path="user" value="${idOfSession}" />


    <h1>Edit Your Book</h1>
    <a href="/home" class="btn btn-dark">Bookshelf</a>
    <div>
        <form:label path="title">Title</form:label>
        <form:errors path="title" class="text-danger"/>
        <form:input path="title" class="form-control"/>
    </div>
    <div>
        <form:label path="author">Author</form:label>
        <form:errors path="author" class="text-danger"/>
        <form:input path="author" class="form-control"/>
    </div>
    <div>
        <form:label path="thoughts">Thoughts</form:label>
        <form:errors path="thoughts" class="text-danger"/>
        <form:textarea path="thoughts" class="form-control"/>
    </div>   
    <input type="submit" value="Submit" class="btn btn-dark mt-3"/>
</form:form>    


    </div>

</body>
</html>