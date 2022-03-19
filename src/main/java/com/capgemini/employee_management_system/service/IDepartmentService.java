package com.capgemini.employee_management_system.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.employee_management_system.exception.DepartmentNotFoundException;
import com.capgemini.employee_management_system.entity.Department;
import com.capgemini.employee_management_system.dao.Departmentdao;

/*****************************************************************************
 * IDepartment Service Class 
 * Created By: Pradnya Khot
 * Date:18/03/2022 
 *******************************************************************************/


public interface IDepartmentService 
{
	public Department addDepartment(Departmentdao departmentdao);
	public List<Department> getAllDepartment();
	public List<Department> getAllDepartmentByPagination(String maxPage) throws DepartmentNotFoundException;
	public int getDeparCount();
	public void deleteDepartment(int id);
}
