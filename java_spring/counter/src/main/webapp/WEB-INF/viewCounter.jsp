<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

    

    <div class="container">

        <h1>You have visited <a href="/">http://localhost:8080/</a> <span><%= session.getAttribute("count") %></span> times</h1>
        
        <h4><a href="/">Test another visit?</a></h4>

        <h3>
            <% Integer counter = (Integer)session.getAttribute("counter");         if (counter == null) {             counter = new Integer(1);         } else {             counter = new Integer(counter.intValue() + 1);         }         session.setAttribute("counter", counter);         %>
        </h3>

    </div>
   
</body>
</html>