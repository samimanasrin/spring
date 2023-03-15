<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="template.jsp"%>

</head>
<body>

	<div class="container">
		<div class="row">

			<div class="bag">

				<div class="container">
					<h1 class="text-center mb-5">Update Student Registration Form</h1>
					<form action="${pageContext.request.contextPath}/create-student"
						method="post">
						<input type="hidden" class="form-control" name="id"
							value="${student.id}">


						<div class="row">
							<div class="col-lg-4 text-center">
								<label class="form-label ">Name</label>
							</div>
							<div class="col-lg-4">
								<input type="text" class="form-control" name="name"
									value="${student.name}">
							</div>
						</div>
						<div class="row mt-2">
							<div class="col-lg-4 text-center">
								<label class="form-label ">Email</label>
							</div>
							<div class="col-lg-4">
								<input type="email" class="form-control" name="email"
									value="${student.email}">
							</div>
						</div>
						<div class="row mt-2">
							<div class="col-lg-4 text-center">
								<label class="form-label ">Cell Number</label>
							</div>
							<div class="col-lg-4">
								<input type="text" class="form-control" name="cell"
									value="${student.cell}">
							</div>
						</div>
						<div class="row mt-2">
							<div class="col-lg-4 text-center">
								<label class="form-label ">Gender</label>
							</div>
							<div class="col-lg-4">
								<input type="radio" value="Male" name="gender">Male <input
									type="radio" value="Female" name="gender">Female
							</div>
						</div>
						<div class="row mt-2">
							<div class="col-lg-4 text-center">
								<label class="form-label ">Subject</label>
							</div>
							<div class="col-lg-4">
								<select class="form-select" name="subject">
									<option selected>Select subject</option>
									<option value="Java">Java</option>
									<option value="HTML">HTML</option>
									<option value="CSS">CSS</option>
									<option value="PHP">PHP</option>
									<option value="C++">C++</option>
									<option value="Python">Python</option>
								</select>
							</div>
						</div>

						<div class="text-center mt-5">
							<button type="submit" class="btn btn-primary">Update</button>
						</div>
					</form>

				</div>

			</div>

		</div>
	</div>
</body>
</html>