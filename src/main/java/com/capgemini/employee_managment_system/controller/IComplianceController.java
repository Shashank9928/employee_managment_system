package com.capgemini.employee_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee_managment_system.entity.Compliance;
import com.capgemini.employee_managment_system.service.IComplianceService;

@RestController
@RequestMapping("/compliance")
public class IComplianceController {

    @Autowired
    private IComplianceService complianceService;

    @PostMapping("/add")
    public void addCompliance(@RequestBody Compliance compliance) {
        complianceService.addCompliance(compliance);
    }

}
