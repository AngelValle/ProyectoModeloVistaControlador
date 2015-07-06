<%@page import="servlet.ServletDepartment2"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
	</head>
	<body>
		<h1>LEER EMPLEADO</h1>
		<p>Ingrese la ID de usuario a leer</p>
		<form action="ServletLeerEmpleado" method="get">
			<input type="text" name="idempleado">
			<input type="submit" value="Solicitar">
		</form>
		<br>
		<h1>LEER EMPLEADOS POR DEPARTAMENTO</h1>
		<form action="ServletDepartment2" method="get">
			<input type="submit" value="Actualizar">
		</form>
		
		<table align="right" bordercolor="BLACK" bgcolor="#FFFFFF">
			<tr><td><a href="index.jsp">Inicio</a></td></tr>
		</table>
	</body>	
</html>