<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>







<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Fruit Store</title>
</head>
<body>
	<div class="container">
		<h1 class="m-5">Fruit Store</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
				</tr>
			</thead>
			<tbody>
	
				<c:forEach var="singleInfo" items="${displayFruits }">
					<tr>
						<td><c:out value="${singleInfo.name}"></c:out></td>
						<td><c:out value="${singleInfo.price}"></c:out></td>

					</tr>
				</c:forEach>


			</tbody>
		</table>


	</div>


</body>
</html>