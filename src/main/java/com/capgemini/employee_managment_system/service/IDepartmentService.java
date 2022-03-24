package com.capgemini.employee_managment_system.service;

import java.util.List;

import com.capgemini.employee_managment_system.entity.Department;
import com.capgemini.employee_managment_system.exception.DepartmentNotFoundException;
import com.capgemini.employee_managment_system.dao.Departmentdao;

/*****************************************************************************
 * IDepartment Service Class
 * Created By: Pradnya Khot
 * Date:18/03/2022
 *******************************************************************************/

public interface IDepartmentService {
    public Department addDepartment(Department department);

    public List<Department> getAllDepartment();

    public List<Department> getAllDepartmentByPagination(String maxPage) throws DepartmentNotFoundException;

    public int getDeparCount();

    public void deleteDepartment(int id);
}