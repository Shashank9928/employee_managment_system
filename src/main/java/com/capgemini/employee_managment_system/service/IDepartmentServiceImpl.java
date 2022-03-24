package com.capgemini.employee_managment_system.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.capgemini.employee_managment_system.dao.Departmentdao;
import com.capgemini.employee_managment_system.entity.Department;
import com.capgemini.employee_managment_system.repository.IDepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****************************************************************************
 * IDepartment ServiceImpl Class
 * Created By: Pradnya Khot
 * Date:18/03/2022
 *******************************************************************************/

@Service
@Transactional
public class IDepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private IDepartmentRepository idepartmentrepository;

    /*********************************************************************************************************************
     * /*
     * Method: addDepartment Description: It adds department
     * 
     * @Override: It indicates that the child class method is over-writing its base
     *            class method. return: It returns department object
     */

    @Override
    public Department addDepartment(Department department) {
        Department depart = new Department();
        depart.setDepartId(department.getDepartId());
        depart.setDepartName(department.getDepartName());
        return idepartmentrepository.save(depart);
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getAllDepartment
     * Description: It views all department
     * 
     * @Override: It indicates that the child class method is over-writing its base
     *            class method. return: It returns department list
     */

    @Override
    public List<Department> getAllDepartment() {
        return idepartmentrepository.findAll();
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getAllDepartmentByPagination
     * Description: It views all department by pagination
     * 
     * @Override: It indicates that the child class method is over-writing its base
     *            class method. return: It returns department list
     */

    @Override
    public List<Department> getAllDepartmentByPagination(String maxPage) {
        List<Department> department = idepartmentrepository.findAll();
        return department;
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getDeparCount
     * Description: It views all department by pagination
     * 
     * @Override: It indicates that the child class method is over-writing its base
     *            class method. return: It returns department list
     */

    @Override
    public int getDeparCount() {

        return (int) idepartmentrepository.count();
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: deleteDepartment
     * Description: It deletes the department for employee.
     * 
     * @Override: It indicates that the child class method is over-writing its base
     *            class method. return: It returns the order.
     */

    @Override
    public void deleteDepartment(int id) {
        idepartmentrepository.deleteById(id);
    }

}