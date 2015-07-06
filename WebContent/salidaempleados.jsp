<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
	 	<%
	 	out.println("<h1>LISTA EMPLEADOS:</h1>");
		@SuppressWarnings("unchecked")
 		List<Employees> empleadoleidos = (List<Employees>)request.getAttribute("empleadosleido");
	 	Iterator<Employees> it_empladosleidos = empleadoleidos.iterator();
	 	while(it_empladosleidos.hasNext())
	 	{
	 		Employees empleadoactual = it_empladosleidos.next();
		 	out.println("<table border=1 width=400><tr><th bgcolor=\"#BBBBBB\">Trabajador: "+empleadoactual.getEmployeeId()+"</th></tr>");
	 		out.println("<tr><td width=200>Nombre:</td><td width=200>"+empleadoactual.getFirstName()+"</td></tr>");
	 		out.println("<tr><td width=200>Apellido:</td><td width=200>"+empleadoactual.getLastName()+"</td></tr>");
	 		out.println("<tr><td width=200>Departamento:</td><td width=200>"+empleadoactual.getDepartments().getDepartmentName()+"</td></tr>");
	 		out.println("<tr><td width=200>ID_Departamento:</td><td width=200>"+empleadoactual.getDepartments().getDepartmentId()+"</td></tr>");
	 		out.println("</table>");
	 		out.println("<br>");
	 	}
	 	out.println("<table align=\"right\" bordercolor=\"BLACK\" bgcolor=\"#FFFFFF\"><tr><td><a href=\"index.jsp\">Inicio</a></td></tr></table>");
 		%>
<!--  		<h1>Lista Empleados:</h1> -->
<%-- 		<jsp:useBean id="empleadosleido" type="java.util.List" scope="request"/> --%>
<%-- 		<jsp:getProperty name="empleadosleido" property="employeeId"/> --%>
<%-- 		<jsp:getProperty name="empleadosleido" property="firstName"/> --%>
<%-- 		<jsp:getProperty name="empleadosleido" property="lastName"/> --%>
	</body>	
</html>