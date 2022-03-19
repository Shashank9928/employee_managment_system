package employee_management_system.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import employee_management_system.entity.Employee;
import employee_management_system.exception.EmployeeNotFoundException;

/*****************************************************************************
 * IEmployee Employee Repository Class 
 * Created By: Lakshita Mathur
 * Date:19/03/2022 
 *******************************************************************************/

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
	public Employee findById(long id) throws EmployeeNotFoundException;

}