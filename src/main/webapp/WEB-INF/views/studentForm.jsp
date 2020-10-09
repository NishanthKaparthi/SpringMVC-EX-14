<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red
	}
</style>
</head>
<body>
	<form:form action="/createStudent" modelAttribute="student">
		<label for="firstNameInput">FirstName: </label>
		<form:input path="firstName" id="firstNameInput" /><br>
		<span><form:errors path="firstName" cssClass="error"></form:errors></span>
		<br>
		<label for="lastNameInput">LastName: </label>
		<form:input path="lastName" id="lastNameInput" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<label for="ageInput">Age: </label>
		<form:input path="age" id="ageInput" />
		<form:errors path="age" cssClass="error"></form:errors>
		<br>
		<label for="addressInput">Address: </label>
		<form:input path="address" id="addressInput" />
		<form:errors path="address" cssClass="error"></form:errors>
		<br>
		<label for="phoneNumberInput">PhoneNumber: </label>
		<form:input path="phoneNumber" id="phoneNumberInput" />
		<form:errors path="phoneNumber" cssClass="error"></form:errors>
		<br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>