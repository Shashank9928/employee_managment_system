package com.capgemini.employee_managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.employee_managment_system.entity.Compliance;
import com.capgemini.employee_managment_system.entity.Department;
import com.capgemini.employee_managment_system.repository.IComplianceReository;
import com.capgemini.employee_managment_system.repository.IDepartmentRepository;

@Service
@Transactional
public class IComplianceServiceImpl implements IComplianceService {

    @Autowired
    private IComplianceReository complianceRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public void addCompliance(Compliance compliance) {
        System.out.println("********************************CHECK HERE************************************");
        System.out.println(compliance.getComplianceDate());
        System.out.println(compliance.getD_id());
        Department department = departmentRepository.findById(compliance.getD_id());
        System.out.println(department.getName());
        Compliance compliance1 = new Compliance();
        compliance1.setComplianceType(compliance.getComplianceType());
        compliance1.setComplianceDescription(compliance.getComplianceDescription());
        compliance1.setEmployeeCount(compliance.getEmployeeCount());
        compliance1.setStsCount(compliance.getStsCount());
        compliance1.setComplianceStatus(compliance.getComplianceStatus());
        compliance1.setDepartment(department);
        compliance1.setD_id(compliance.getD_id());
        complianceRepository.save(compliance1);
        System.out.println("********************************ADDED************************************");
    }

}
