package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.StatusReport;

import java.util.List;

/***************************************************************************************
 * @author: Shashank Mathur
 *          Description: This is the interface class for the StatusReport
 *          Date: 17-3-2022
 *          version: 1.0
 * 
 ****************************************************************************************/
public interface IStatusReport {

    /**************************************************************
     * Method: addStatusReport
     * Description: This method is used to add the StatusReport
     * 
     * @param statusReport
     * @return statusReport object
     **************************************************************/
    public StatusReport addStatusReport(StatusReport statusReport);

    /**************************************************************
     * Method: AllStatusReport
     * Description: This method is used to get all the StatusReport
     *
     * 
     * @return List statusReport object
     **************************************************************/

    public List<StatusReport> AllStatusReport();

}