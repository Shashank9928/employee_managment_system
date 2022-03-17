package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employee_managment_system.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public User findById(int id);
}