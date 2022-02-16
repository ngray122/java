<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <!-- Formatting (like dates) -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
   <!-- form:form -->
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
   <!-- for rendering errors on PUT routes -->
 <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title Here</title>
  <!-- Bootstrap -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
    <div class="container"> 

<table class="table m-4">
  <h1>Save Travels</h1>
  <thead>
    <tr class="table">
      <th scope="col">Expense</th>
      <th scope="col">Vendor</th>
      <th scope="col">Amount</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items='${ expenses }' var='expenseObj'>
      <tr class="table-success">
        <td>${expenseObj.name}</td>
        <td>${expenseObj.vendor}</td>
        <td>${expenseObj.amount}</td>
        <td><a href="/expenses/edit/${expenseObj.id}">edit</a></td>
        <td><a href="/expenses/edit/${expenseObj.id}">delete</a></td>
      </tr>

    </c:forEach>

  </tbody>
</table>
        

<hr><hr>

<form:form action="/expenses/create" method="post" modelAttribute="newExpenses" class="container m-4">
  <h1>Add an Expense:</h1>
  <div class="mb-3">
    <form:label path="name" class="form-label">Expense Name:</form:label>
    <form:errors path="name"  class="text-danger"/>
    <form:input path="name" class="form-control"/>
  </div>
  <div class="mb-3">
    <form:label path="vendor" class="form-label">Vendor:</form:label>
    <form:errors path="vendor"  class="text-danger"/>
    <form:input path="vendor" class="form-control"/>
  </div>
  <div class="mb-3">
    <form:label path="amount" class="form-label">Amount:</form:label>
    <form:errors path="amount"  class="text-danger"/>
    <form:input path="amount" type="number" step="0.01" class="form-control"/>
  </div>
  <div class="mb-3">
    <form:label path="description" class="form-label">Description:</form:label>
    <form:errors path="description" class="text-danger"/>
    <form:textarea path="description" class="form-control" rows="3" />
  </div>
  <input type="submit" value="Submit"/>
</form:form>
    </div>
</body>
</html>