package com.capgemini.employee_managment_system.service;

import java.util.List;

import com.capgemini.employee_managment_system.entity.Employee;
import com.capgemini.employee_managment_system.exception.EmployeeNotFoundException;

/*****************************************************************************
 * IEmployee Employee Service Class
 * Created By: Lakshita Mathur
 * Date:19/03/2022
 *******************************************************************************/

public interface IEmployeeService {

    List<Employee> getAllEmployee();

    Employee updateEmployeeById(int id, Employee e);

    Employee saveEmployee(Employee employee);

    // Employee getEmployeeById(int id);
    void deleteEmployeeById(int id);

    public List<Employee> getAllEmployeeByPagination(String maxPage) throws EmployeeNotFoundException;
}