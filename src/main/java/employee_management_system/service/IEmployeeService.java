package employee_management_system.service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import employee_management_system.exception.*;

import employee_management_system.dto.Employeedto;
import employee_management_system.entity.Employee;

/*****************************************************************************
 * IEmployee Employee Service Class 
 * Created By: Lakshita Mathur
 * Date:19/03/2022 
 *******************************************************************************/

public interface IEmployeeService {
	
	List<Employee> getAllEmployee();
	Employee updateEmployeeById(long id, Employee e);
	Employee saveEmployee(Employee employee);
//	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	public List<Employee> getAllEmployeeByPagination(String maxPage) throws EmployeeNotFoundException;
}