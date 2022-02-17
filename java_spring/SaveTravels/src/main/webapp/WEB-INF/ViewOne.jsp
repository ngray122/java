<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

   <!-- c:out ; c:forEach ; c:if -->
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Full CRUD Save Travels</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body class="container text-center">

<div class="card">
  <h1>Expense Details</h1>
  <div class="card-body">
    <h5 class="card-title">Expense name: ${expense.name}</h5>
    <p class="card-text">Vendor: ${expense.vendor}</p>
    <p class="card-text">Price: $${expense.amount}</p>
    <p class="card-text">Description: ${expense.description}</p>
 
    <a href="/expenses" class="btn btn-dark">Home</a>
    <a href="/expenses/delete/${id}" class="btn btn-dark">Delete</a>
    <a href="/expenses/edit/${id}" class="btn btn-dark">Edit</a>
  </div>
</div>
</body>
</html>