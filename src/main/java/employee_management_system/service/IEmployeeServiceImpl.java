package employee_management_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import employee_management_system.entity.*;
import employee_management_system.repository.*;
import employee_management_system.exception.*;
import employee_management_system.service.*;
import employee_management_system.entity.*;
import employee_management_system.repository.*;
import employee_management_system.dto.*;


/*****************************************************************************
 * IEmployee IEmployee Class 
 * Created By: Lakshita Mathur
 * Date:19/03/2022 
 *******************************************************************************/


@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository iemployeeRepository;
	
	@Autowired
	private IDepartmentRepository idepartmentRepository;
	
	@Autowired
	private IUserRepository iuserRepository;
	


/*********************************************************************************************************************	
	/*
	 * Method: saveEmployee Description: It adds employee
	 * @Override: It indicates that the child class method is over-writing its base
	 * class method. return: It returns employee object
	 */

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = new Employee();
		Department d = idepartmentRepository.findById(employee.getD_id());
		User u = iuserRepository.findById(employee.getU_id());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmail(employee.getEmail());
		emp.setDateOfBirth(employee.getDateOfBirth());
		emp.setDepartment(d);
		emp.setUser(u);
		emp.setD_id(employee.getD_id());
		emp.setU_id(employee.getU_id());
		iemployeeRepository.save(emp);
		return emp;
	}
	
/*********************************************************************************************************************	
	/*
	 * Method:  getEmployeeById
	 * Description: It views all employee
	 * @Override: It indicates that the child class method is over-writing its base
	 * class method. return: It returns employee list
	 */
	
	@Override
	public List<Employee> getAllEmployee() {
		return iemployeeRepository.findAll();
	}
	
/*********************************************************************************************************************	
	/*
	 * Method:  updateEmployeeById
	 * Description: It views updated employee
	 * @Override: It indicates that the child class method is over-writing its base
	 * class method. return: It returns employee list
	 */
	
	@Override
	public Employee updateEmployeeById(long id, Employee employee) {
		Employee emp = new Employee();
		try {
			 emp = iemployeeRepository.findById(id);
		}
		catch(EmployeeNotFoundException exp) {
			return emp;
		}
		Department d = idepartmentRepository.findById(employee.getD_id());
		User u = iuserRepository.findById(employee.getU_id());
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmail(employee.getEmail());
		emp.setDateOfBirth(employee.getDateOfBirth());
		emp.setDepartment(d);
		emp.setUser(u);
		emp.setD_id(employee.getD_id());
		emp.setU_id(employee.getU_id());
		iemployeeRepository.save(emp);
		return emp;
	}
	
/*********************************************************************************************************************	
	/*
	 * Method: deleteEmployeeById
	 * Description: It deletes the employee.
	 * @Override: It indicates that the child class method is over-writing its base
	 * class method. return: It returns the order.
	 */
	
	@Override
	public void deleteEmployeeById(long id) {
		this.iemployeeRepository.deleteById(id);
	}
	
/*********************************************************************************************************************	
	/*
	 * Method: getAllEmployeeByPagination 
	 * Description: It views all employee by pagination
	 * @Override: It indicates that the child class method is over-writing its base
	 * class method. return: It returns employee list
	 */


	@Override
	public List<Employee> getAllEmployeeByPagination(String maxPage) 
	{
		List<Employee> employee = iemployeeRepository.findAll();
		return employee;
	}
}