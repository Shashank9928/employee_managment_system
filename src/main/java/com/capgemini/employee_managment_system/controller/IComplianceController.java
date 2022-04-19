package com.capgemini.employee_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee_managment_system.entity.Compliance;
import com.capgemini.employee_managment_system.service.IComplianceService;

import java.util.List;

/***************************************************************************************
 * @author: Shashank Mathur
 *          Description: This is the controller class for the compliance
 *          Date: 17-3-2022
 *          version: 1.0
 * 
 ****************************************************************************************/

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/compliance")
public class IComplianceController {

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
    private IComplianceService complianceService;

    /***********************************************************************
     * Method: addCompliance
     * Description: This method is used to add the compliance
     * 
     * @param compliance
     * @return ResponseEntity<Compliance> with status code as HttpStatus.Created
     *         and compliance object
     ***********************************************************************/

    @PostMapping("/addCompliance")
    public ResponseEntity<Compliance> addCompliance(@RequestBody Compliance compliance) {
        Compliance result = null;
        try {
            result = complianceService.addCompliance(compliance);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    /***********************************************************************
     * Method: getCompliance
     * Description: This method is used to get the compliance
     * 
     * @param id
     * @return ResponseEntity<Compliance> with status code as HttpStatus.OK and
     *         compliance object
     ***********************************************************************/
    @GetMapping("/getAllCompliance")
    public ResponseEntity<List<Compliance>> getCompliance() {
        List<Compliance> result = complianceService.getAllCompliance();
        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    /***********************************************************************
     * Method: getComplianceByUserId
     * Description: This method is used to get the compliance by user id
     * 
     * @param UserId
     * @return ResponseEntity<Compliance> with status code as HttpStatus.OK and
     *         compliance object with user id
     *         HttpStatus.NotFound if data of that user id is not found
     ***********************************************************************/
    @GetMapping("/getComplianceByUserId/{UserId}")
    public ResponseEntity<List<Compliance>> getComplianceByUserId(@PathVariable("UserId") int UserId) {
        List<Compliance> result = complianceService.getComplianceByUserId(UserId);
        if (result.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
