package com.capgemini.employee_managment_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagmentSystemApplication.class, args);
		System.out.println("Employee Management System Server Started");
	}

}
