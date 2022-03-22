package com.capgemini.employee_managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.employee_managment_system.entity.StatusReport;
import com.capgemini.employee_managment_system.repository.IComplianceReository;
import com.capgemini.employee_managment_system.repository.IDepartmentRepository;
import com.capgemini.employee_managment_system.repository.IUserRepository;
import com.capgemini.employee_managment_system.repository.IStatusReportRepository;

import java.util.List;

/***************************************************************************************
 * @author: Shashank Mathur
 *          Description: This is the serviceImplementation class for the
 *          compliance
 *          Date: 17-3-2022
 *          version: 1.0
 **************************************************************************************/

/*
 * @Transactional: It is used to make a transaction management for the
 * application.
 * 
 */
@Service
@Transactional
public class IStatusReportImpl implements IStatusReport {

    @Autowired
    private IStatusReportRepository statusReportRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private IComplianceReository complianceRepository;

    /***********************************************************************
     * Method: addStatusReport
     * Description: This method is used to add the StatusReport
     * 
     * @param statusReport
     * @return statusReport object
     ***********************************************************************/

    @Override
    public StatusReport addStatusReport(StatusReport statusReport) {
        StatusReport statusReport1 = new StatusReport();
        // Find the department object by provided Depetment Id
        statusReport1.setCompliance(complianceRepository.findByComplianceId(statusReport.getC_id()));

        // Find the user object by provided User Id and set it to the statusReport
        statusReport1.setUser(userRepository.findById(statusReport.getU_id()));

        // Find the department object by provided Depetment Id and set it to the
        // statusReport
        statusReport1.setDepartment(departmentRepository.findById(statusReport.getD_id()));

        statusReport1.setComments(statusReport.getComments());
        statusReport1.setDetails(statusReport.getDetails());

        // Save the status report in the database, and return it afterwards.
        statusReportRepository.save(statusReport1);
        return statusReport1;

    }

    /***********************************************************************
     * Method: AllStatusReport
     * Description: This method is used to get all the StatusReport
     * 
     * @return List statusReport object
     ***********************************************************************/
    @Override
    public List<StatusReport> AllStatusReport() {
        return statusReportRepository.findAll();
    }

}
