<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container m-3">

    
    <div class="card ">
        <div class="card-header">
            <h1>Here is your Omikuji</h1>
          </div>
       
        <h4 class="card-text m-3">In <span><%= session.getAttribute("formNum") %></span> years, you will live in <span><%= session.getAttribute("formCity") %> </span>with <span> <%= session.getAttribute("formName") %></span> as your roommate, <span><%= session.getAttribute("formHobby") %></span>  for a living. The next time you see a  <span><%= session.getAttribute("formThing") %></span>, you will have good luck.  Also,  <span><%= session.getAttribute("formEnterTextArea") %>!</span></h4>

    </div>




<button type="button" class="btn btn-info m-3"><a href="/">Home</a></button>

</div>
</body>
</html>