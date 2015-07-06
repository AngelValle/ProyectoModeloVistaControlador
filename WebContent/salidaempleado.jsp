<%@page import="clases.Employees"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salida</title>
	</head>
	<body>
		<h1>EMPLEADO:</h1>
	 	<%
 		Employees empleadoleido = (Employees)request.getAttribute("empleadoleido");
	 	if(null==empleadoleido)
	 	{
	 		out.println("No se ha encontrado empleado con esa ID.");
	 	}
	 	else
	 	{
	 		out.println(empleadoleido.toString()+"<br>");
	 	}
 		%>
<%-- 		<jsp:useBean id="empleadoleido" class="clases.Employees" scope="request"/> --%>
<%-- 		<jsp:getProperty name="empleadoleido" property="employeeId"/> --%>
<%-- 		<jsp:getProperty name="empleadoleido" property="firstName"/> --%>
<%-- 		<jsp:getProperty name="empleadoleido" property="lastName"/> --%>
	</body>	
</html>