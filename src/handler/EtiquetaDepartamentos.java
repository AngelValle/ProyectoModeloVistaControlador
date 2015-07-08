package handler;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import clases.Employees;
import servicios.DepartmentsServices;

public class EtiquetaDepartamentos extends SimpleTagSupport{
	
	int id;
	
	@Override
	public void doTag() throws JspException, IOException 
	{
		DepartmentsServices ds = new DepartmentsServices();
		List<Employees> list_employees = ds.listaEmpleadoPorDepartamento(id);
		int contador=1;
		for (Employees employees : list_employees) 
		{
			PageContext pc = (PageContext)getJspContext();
			ServletRequest request = pc.getRequest();
			request.setAttribute("empleado", employees);
			
			getJspContext().getOut().println("<table bgcolor=BBBBBB border=1 width=600><tr><th bgcolor=80B5FF>Trabajador</th></tr>");
  	 		getJspContext().getOut().println("<tr><td width=100 bgcolor=FFFFFF>Nº: "+contador+"</td><td width=500 bgcolor=FFFFFF>");
  	 		getJspBody().invoke(null);
  	 		getJspContext().getOut().println("</td></tr></table><br>");
			contador++;
		}
 		getJspContext().getOut().println("Numero de empleados: "+(contador-1));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
