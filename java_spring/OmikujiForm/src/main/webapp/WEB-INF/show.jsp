<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">

<h1>In <span><%= session.getAttribute("formNum") %></span> years, you will live in <span><%= session.getAttribute("formCity") %> </span>with <span> <%= session.getAttribute("formName") %></span> as your roommate, <span><%= session.getAttribute("formHobby") %></span>  for a living. The next time you see a  <span><%= session.getAttribute("formThing") %></span>, you will have good luck.  Also,  <span><%= session.getAttribute("formEnterTextArea") %>!</span></h1>


<button href="/">Home</button>

</div>
</body>
</html>