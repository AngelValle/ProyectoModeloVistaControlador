package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.DepartmentsServices;
import clases.Employees;

public class ServletLeerEmpleadosPorDepartamento extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Integer id_departamento = Integer.parseInt(req.getParameter("iddepartamento"));
		List<Employees> list_employees = null;
		
		DepartmentsServices departmentsservices = new DepartmentsServices();
		
		list_employees = departmentsservices.listaEmpleadoPorDepartamento(id_departamento);
		
//		resp.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = resp.getWriter();
//		
//		out.println("<table><tr><th>Lista:</th></tr><tr><td><ul>");
//		for (Employees emp : list_employees) 
//		{
//			out.println("<li>"+emp.toString()+"</li>");
//		}
//		out.println("</ul></td></tr></table>"+"<table align=\"right\" bordercolor=\"BLACK\" bgcolor=\"#FFFFFF\"><tr><td><a href=\"index.html\">Inicio</a></td></tr></table>");
		
		req.setAttribute("empleadosleido", list_employees);
		req.getRequestDispatcher("salidaempleados.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		super.doPost(req, resp);
	}

}
