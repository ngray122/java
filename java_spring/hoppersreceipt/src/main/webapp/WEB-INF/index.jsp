<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Hopper</title>
</head>
<body>
<div class="container mx-auto">
<div class="card ">
  <div class="card-body">
     <h1 class="card-title"><c:out value="${displayName}"></c:out> </h1>
     <h3 class="card-title"><c:out value="${displayItemName }"></c:out> </h3>
     <h3 class="card-title"><c:out value="${displayPrice }"></c:out> </h3>
     <h3 class="card-title"><c:out value="${displayDescription }"></c:out> </h3>
     <h3 class="card-title"><c:out value="${displayVendor }"></c:out> </h3>
  </div>
</div>   

</div>

</body>
</html>