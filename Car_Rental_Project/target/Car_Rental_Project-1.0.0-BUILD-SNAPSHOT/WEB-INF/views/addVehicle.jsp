<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Vehicle</title>
</head>
<body>
	<form:form modelAttribute="newVehicle" enctype="multipart/form-data">
	<%-- <form:form modelAttribute="newVehicle" > --%>
		<p>
			Vehicle ID:
			<form:input id="vehicleId" path="vehicleId" type="text" />
			<form:errors path="vehicleId" cssStyle="color : red;" />
		</p>
		<p>
			Class:
			<form:select id="vehicleClass" path="vehicleClass.id">
				<form:option value="0" label="--Select Class --" />
				<form:options items="${vehicleClasses}" itemLabel="classType"
					itemValue="id" />
			</form:select>
		</p>
		<p>
			Category:
			<form:select id="category" path="category.id">
				<form:option value="0" label="--Select Vehicle --" />
				<form:options items="${categories}" itemLabel="vehicleType"
					itemValue="id" />
			</form:select>
		</p>

		<p>
			Description:
			<form:input id="description" path="description" type="text" placeholder="Make, Model .."/>
			<form:errors path="description" cssStyle="color : red;" />
		</p>
		<p>
			Capacity:
			<form:input id="capacity" path="capacity" type="text" placeholder="Total Available Seats" />
		</p>
		<p>
			Allowed Bags:
			<form:input id="bags" path="bags" type="text" placeholder=" Number of Bags"/>
			<form:errors path="bags" cssStyle="color : red;" />
		</p>

		<p>
			Price per Day:
			<form:input id="price" path="price" type="text" />
			<form:errors path="price" cssStyle="color : red;" />
		</p>
		<p>
			Special Features:
			<form:textarea id="specialFeatures" path="specialFeatures" rows="2" />
			<form:errors path="specialFeatures" cssStyle="color : red;" />
		</p>

		<p>
			Upload Image:
			<form:input id="vehicleImage" path="vehicleImage" type="file" />
		</p>

		<p>
			<input type="submit" id="addButton" value="Add Vehicle" />
		</p>

	</form:form>
	<p>
		<spring:url value="/vehicle/showVehicle" var="show" />
		<a href="${show}"><button>Cancel</button></a>
	</p>

</body>
</html>