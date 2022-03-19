package employee_management_system.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import employee_management_system.entity.Department;
import employee_management_system.entity.User;
import employee_management_system.exception.EmployeeNotFoundException;

/*****************************************************************************
 * IEmployee User Repository Class 
 * Created By: Lakshita Mathur
 * Date:19/03/2022 
 *******************************************************************************/

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
	public User findById(int id);
}
