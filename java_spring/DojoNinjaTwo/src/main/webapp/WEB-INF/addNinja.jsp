<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>

<body>

	<div class="container">



		<form:form action="/ninja/create" method="post" modelAttribute="ninja">
			<h1>Add Ninja</h1>
			<div>
				<form:label path="firstName" class="form-label">First Name:</form:label>
				<form:errors path="firstName" />
				<form:input path="firstName" class="form-control"/>
			</div>
			<div>
				<form:label path="lastName" class="form-label">Last Name:</form:label>
				<form:errors path="lastName" class="text-danger"/>
				<form:input path="lastName" class="form-control"/>
			</div>
			<div>
				<form:label path="age" class="form-label">Age:</form:label>
				<form:errors path="age" class="text-danger" />
				<form:input path="age" type="number" class="form-control"/>
			</div>
			<div>
				<form:label path="dojo" class="form-label">Dojo:</form:label>
				<form:errors path="dojo" class="text-danger"/>
				<form:select path="dojo" class="form-select">

					<c:forEach var="dojo" items="${allDojos}">
				
						<form:option value="${dojo.id}" path="dojo_id">
				
							<c:out value="${dojo.name}" />
						</form:option>
					</c:forEach>


				</form:select>
			</div>


			<input type="submit" value="Submit" class="btn btn-dark m-3"/>
			<a href="/" class="btn btn-dark">Home</a>
		</form:form>
	
	</div>

</body>

</html>