package servicios;

import java.util.List;
import dao.DepartmentsDAO;
import clases.Departments;
import clases.Employees;

public class DepartmentsServices {
	
	public List<Departments> listaDepartamentosConTrabajadores()
	{
		DepartmentsDAO departmentsdao = new DepartmentsDAO();
		List<Departments> list_departamentos = departmentsdao.listaDepartamentosConTrabajadores();
		
		return list_departamentos;
	}
	
	public List<Employees> listaEmpleadoPorDepartamento(int id_departamento)
	{
		DepartmentsDAO departmentsdao = new DepartmentsDAO();
		List<Employees> list_employees = departmentsdao.listaEmpleadoPorDepartamento(id_departamento);

		return list_employees;
	}
}
