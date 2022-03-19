package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.employee_managment_system.entity.Compliance;

import java.util.List;

@Repository
public interface IComplianceReository extends JpaRepository<Compliance, Integer> {

    public List<Compliance> findByUserId(int userId);

    public Compliance findByComplianceId(int complianceId);

}
