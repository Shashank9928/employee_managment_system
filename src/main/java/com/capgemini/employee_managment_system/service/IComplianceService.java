package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.Compliance;

/***************************************************************************************
 * @author: Shashank Mathur
 *          Description: This is the interface class for the compliance
 *          Date: 17-3-2022
 *          version: 1.0
 * 
 ****************************************************************************************/
public interface IComplianceService {

    /***********************************************************************
     * Method: addCompliance
     * Description: This method is used to add the compliance
     * 
     * @param compliance
     * @return compliance object
     ***********************************************************************/
    public Compliance addCompliance(Compliance compliance);
}