package com.capgemini.employee_managment_system.repository;

import java.util.List;

import com.capgemini.employee_managment_system.entity.Employee;
import com.capgemini.employee_managment_system.exception.EmployeeNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*****************************************************************************
 * IEmployee Employee Repository Class
 * Created By: Lakshita Mathur
 * Date:19/03/2022
 *******************************************************************************/

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    public Employee findById(int id) throws EmployeeNotFoundException;

}