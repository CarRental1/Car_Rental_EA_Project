<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehicle Details</title>
</head>
<body>
	<h1>Vehicle Details</h1>
	<h3>${vehicle.vehicleClass.classType} class	${vehicle.category.vehicleType}</h3>
	<h4>Make/Model: ${vehicle.description}</h4>
	<h4>Available Seats: ${vehicle.capacity}</h4>
	<h4>Baggage: ${vehicle.bags}</h4>
	<h4>Price: $ ${vehicle.price}</h4>
	<h4>Special Features: ${vehicle.specialFeatures}</h4>
</body>
</html>