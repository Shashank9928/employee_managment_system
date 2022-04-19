package com.capgemini.employee_managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee_managment_system.dao.Departmentdao;
import com.capgemini.employee_managment_system.entity.Department;
import com.capgemini.employee_managment_system.exception.DepartmentNotFoundException;
import com.capgemini.employee_managment_system.service.IDepartmentService;

/*****************************************************************************
 * IDepartment Controller Class
 * Created By: Pradnya Khot
 * Date:18/03/2022
 *******************************************************************************/

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/departmentController")
public class IDepartmentController {
    @Autowired
    private IDepartmentService idepartmentservice;

    /*
     * Method: addDepartment
     * Description: It allows to add the Department.
     * 
     * @RequestMapping: It is used to map HTTP requests to handler methods of MVC
     * and REST controllers.
     * 
     * @RestController: It is used to create RESTful web services using MVC.
     * 
     * @PostMapping: It is used to handle the HTTP POST requests matched with given
     * URL expression.
     * 
     * @Autowired: It enables to inject object dependency implicitly.
     * 
     * @RequestBody: It is used to bind HTTP request body with a domain object in
     * method parameter or return type
     */

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        Department departmentimpl = idepartmentservice.addDepartment(department);
        return new ResponseEntity(departmentimpl, HttpStatus.CREATED);
    }

    /*********************************************************************************************************************
     * /*
     * Method: getAllDepartment
     * Description: It allows to fetch all the departments.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @GetMapping("/getAllDepartment")
    public ResponseEntity<Department> getAllDepartment() {
        List<Department> departmentImpl = idepartmentservice.getAllDepartment();
        return new ResponseEntity(departmentImpl, HttpStatus.OK);
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getallDepartmentbypagination
     * Description: It allows to fetch the departments using pagination.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @GetMapping("/getAllDepartmentByPagination/{maxPage}")
    public ResponseEntity<List<Department>> getAllDepartmentByPagination(@PathVariable("maxPage") String maxPage)
            throws DepartmentNotFoundException {
        List<Department> departmentImpl = idepartmentservice.getAllDepartmentByPagination(maxPage);
        if (departmentImpl.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(departmentImpl, HttpStatus.OK);
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getDeparCount
     * Description: It allows to get the count of the departments.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @GetMapping("/getCount")
    public ResponseEntity<Department> getDeparCount() {
        int departmentImpl = idepartmentservice.getDeparCount();
        return new ResponseEntity(departmentImpl, HttpStatus.OK);
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: deleteDepartment
     * Description: It allows to delete the department.
     * 
     * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with
     *                 given URL expression.
     * @PathVariable: It is used to handle template variables in the request URL
     */

    @DeleteMapping("/deleteDepartment/{departId}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable int departId) {
        idepartmentservice.deleteDepartment(departId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
