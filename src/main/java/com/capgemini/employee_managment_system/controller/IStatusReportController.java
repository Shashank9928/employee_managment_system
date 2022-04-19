package com.capgemini.employee_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee_managment_system.entity.StatusReport;
import com.capgemini.employee_managment_system.service.IStatusReport;

import java.util.List;

/***************************************************************************************
 * @author: Shashank Mathur
 *          Description: This is the controller class for the StatusReport
 *          Date: 17-3-2022
 *          version: 1.0
 * 
 ****************************************************************************************/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/statusReport")
public class IStatusReportController {

    /**
     * @RequestMapping: It is used to map HTTP requests to handler methods of MVC
     *                  and REST controllers.
     * @RestController: It is used to create RESTful web services using MVC.
     * @PostMapping: It is used to handle the HTTP POST requests matched with given
     *               URL expression.
     * @Autowired: It enables to inject object dependency implicitly.
     * @RequestBody: It is used to bind HTTP request body with a domain object in
     *               method parameter or return type
     * 
     */

    @Autowired
    private IStatusReport statusReportService;

    /***********************************************************************
     * Method: addStatusReport
     * Description: This method is used to add the statusReport
     * 
     * @param statusReport
     * @return ResponseEntity<StatusReport> with status code as HttpStatus.Created
     *         and statusReport object
     ***********************************************************************/
    @PostMapping("/addStatusReport")
    public ResponseEntity<StatusReport> addStatusReport(@RequestBody StatusReport statusReport) {
        StatusReport result = statusReportService.addStatusReport(statusReport);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    /***********************************************************************
     * Method: AllStatusReport
     * Description: This method is used to get all the statusReport
     * 
     * @return ResponseEntity<List<StatusReport>> with status code as HttpStatus.OK
     *         and statusReport object
     ***********************************************************************/
    @GetMapping("/allStatusReport")
    public ResponseEntity<List<StatusReport>> AllStatusReport() {
        List<StatusReport> result = statusReportService.AllStatusReport();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
