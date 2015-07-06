package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servicios.EmployeesServices;
import clases.Employees;
import dao.EmployeesHibernateDAO;

public class ServletLeerEmpleadoEL extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Integer id_employee = Integer.parseInt(req.getParameter("idempleado"));
		EmployeesHibernateDAO empleadoaleer = new EmployeesHibernateDAO();

		EmployeesServices es = new EmployeesServices();
		es.setO_dao(empleadoaleer);
		
		Employees empleadoleido = (Employees)es.leerEmpleadoService(id_employee);
		if(null==empleadoleido)
		{
			req.getRequestDispatcher("salida.jsp").include(req, resp);
		}

		req.setAttribute("empleadoleido", empleadoleido);
		req.getRequestDispatcher("salidaempleado.jsp").forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		super.doPost(req, resp);
	}

}