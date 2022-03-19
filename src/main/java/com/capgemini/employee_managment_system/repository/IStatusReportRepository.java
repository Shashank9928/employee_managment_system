package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employee_managment_system.entity.StatusReport;

@Repository
public interface IStatusReportRepository extends JpaRepository<StatusReport, Integer> {

}
