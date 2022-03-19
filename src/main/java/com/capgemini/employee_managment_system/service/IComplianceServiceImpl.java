package com.capgemini.employee_managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.employee_managment_system.entity.Compliance;
import com.capgemini.employee_managment_system.entity.Department;
import com.capgemini.employee_managment_system.entity.User;
import com.capgemini.employee_managment_system.repository.IComplianceReository;
import com.capgemini.employee_managment_system.repository.IDepartmentRepository;
import com.capgemini.employee_managment_system.repository.IUserRepository;

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
public class IComplianceServiceImpl implements IComplianceService {
    /**
     * @Autowired: It enables to inject object dependency implicitly.
     * 
     */
    @Autowired
    private IComplianceReository complianceRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private IUserRepository userRepository;

    /***********************************************************************
     * Method: addCompliance
     * Description: This method is used to add the compliance
     * 
     * @param compliance
     * @return compliance object
     ***********************************************************************/

    @Override
    public Compliance addCompliance(Compliance compliance) {
        Department department = departmentRepository.findById(compliance.getD_id());
        System.out.println(department.getName());
        Compliance compliance1 = new Compliance();
        System.out.println(compliance.getU_id());
        User user = userRepository.findById(compliance.getU_id());
        System.out.println(user);

        compliance1.setU_id(compliance.getU_id());
        compliance1.setUser(user);
        compliance1.setComplianceType(compliance.getComplianceType());
        compliance1.setComplianceDescription(compliance.getComplianceDescription());
        compliance1.setEmployeeCount(compliance.getEmployeeCount());
        compliance1.setStsCount(compliance.getStsCount());
        compliance1.setComplianceStatus(compliance.getComplianceStatus());
        compliance1.setDepartment(department);
        compliance1.setD_id(compliance.getD_id());
        complianceRepository.save(compliance1);
        return compliance1;
    }

    /***********************************************************************
     * Method: getAllCompliance
     * Description: This method is used to get all the compliance in List
     * Formet
     * 
     * @return compliance List
     ***********************************************************************/
    @Override
    public List<Compliance> getAllCompliance() {
        List<Compliance> result = complianceRepository.findAll();
        return result;
    }

    /***********************************************************************
     * Method: getComplianceByUserId
     * Description: This method is used to get the compliance
     * 
     * @param userId
     * @return List of compliance
     ***********************************************************************/
    @Override
    public List<Compliance> getComplianceByUserId(int userId) {
        List<Compliance> result = complianceRepository.findByUserId(userId);
        return result;
    }

}
