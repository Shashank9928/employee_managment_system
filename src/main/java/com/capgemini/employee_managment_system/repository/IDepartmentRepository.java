package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employee_managment_system.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

    public Department findById(int id);

}