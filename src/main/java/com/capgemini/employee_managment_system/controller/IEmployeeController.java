package com.capgemini.employee_managment_system.controller;

import com.capgemini.employee_managment_system.entity.Employee;
import com.capgemini.employee_managment_system.exception.EmployeeNotFoundException;
import com.capgemini.employee_managment_system.service.IEmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

/*****************************************************************************
 * IEmployee Employee Controller Class
 * Created By: Lakshita Mathur
 * Date:19/03/2022
 *******************************************************************************/

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee")
public class IEmployeeController {

    @Autowired
    private IEmployeeService iemployeeService;

    /*
     * Method: saveEmployee
     * Description: It allows to add the Employee.
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
    //
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        // save employee to database
        Employee result = iemployeeService.saveEmployee(employee);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    /*********************************************************************************************************************
     * /*
     * Method: getEmployeeById
     * Description: It allows to fetch the employees by there id.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @GetMapping("/getAllEmployee")
    public ResponseEntity<Employee> getAllEmployee() {
        List<Employee> employeeImpl = iemployeeService.getAllEmployee();
        return new ResponseEntity(employeeImpl, HttpStatus.OK);
    }

    /*********************************************************************************************************************
     * /*
     * Method: updateAllEmployee
     * Description: It allows to update the employees.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @PutMapping("/updateEmployeeById/{empId}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable int empId, @RequestBody Employee emp) {
        Employee employeeImpl = iemployeeService.updateEmployeeById(empId, emp);
        return new ResponseEntity(employeeImpl, HttpStatus.OK);
    }

    /*********************************************************************************************************************
     * /*
     * Method: deleteEmployeeById
     * Description: It allows to delete the employee.
     * 
     * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with
     *                 given URL expression.
     * @PathVariable: It is used to handle template variables in the request URL
     */

    @DeleteMapping("/deleteEmployee/{empId}")
    public ResponseEntity<Void> deleteEmployeeById(@PathVariable int empId) {
        iemployeeService.deleteEmployeeById(empId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    /*********************************************************************************************************************
     * 
     * /*
     * Method: getallEmployeebypagination
     * Description: It allows to fetch the employees using pagination.
     * 
     * @GetMapping:It is used to handle the HTTP GET requests matched with given URL
     *                Expression.
     */

    @GetMapping("/getAllEmployeeByPagination/{maxPage}")
    public ResponseEntity<List<Employee>> getAllEmployeeByPagination(@PathVariable("maxPage") String maxPage)
            throws EmployeeNotFoundException {
        List<Employee> employeeImpl = iemployeeService.getAllEmployeeByPagination(maxPage);
        if (employeeImpl.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(employeeImpl, HttpStatus.OK);
    }
}