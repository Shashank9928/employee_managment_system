package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.employee_managment_system.entity.Compliance;

@Repository
public interface IComplianceReository extends JpaRepository<Compliance, String> {

    public Compliance findByUserId(int userId);

}
