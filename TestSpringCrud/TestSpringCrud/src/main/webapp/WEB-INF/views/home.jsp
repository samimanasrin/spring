<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<%@include file="template.jsp"%>
</head>
<body>
	<h1 class="text-center mb-5">All Student Data</h1>

	<div class="container">
		<table class="table table-success table-striped">
			<tr class="text-primary">
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Cell</th>
				<th>Gender</th>
				<th>Subject</th>
				<th>Action</th>

			</tr>
			<c:forEach items="${list}" var="l">

				<tr>
					<td>${l.id}</td>
					<td>${l.name}</td>
					<td>${l.email}</td>
					<td>${l.cell}</td>
					<td>${l.gender}</td>
					<td>${l.subject}</td>
					<td><a href="/delete-student/${l.id}" class="btn btn-danger"><i class="fas fa-trash-alt"></i></a>
						<a href="/edit-student/${l.id}" class="btn btn-warning"><i class="fas fa-edit"></i></a></td>

				</tr>
			</c:forEach>

		</table>

	</div>

</body>
</html>