package com.capgemini.employee_managment_system.entity;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.validation.constraints.NotNull;

/**********************************************************************************************
 * - @author Shashank Mathur
 * - @Description: This is a Department Entity class which is mapped to the
 * database table
 * department.
 * - @since: 17-03-2021
 * - @version: 1.0
 * - @Last modified by: Shashank Mathur
 * - @Last modified time: 17-03-2021
 * 
 **********************************************************************************************/

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employee;

    public Department() {
        // TODO Auto-generated constructor stub
    }

    public Department(String name) {
        /**
         * @param name
         * @param description
         * @param noOfEmployees
         *                      Constructor for Department class with parameters
         *                      name,description,
         *                      noOfEmployees
         *                      to assign value to the variables of Department class
         *                      while creating object of Department class
         * 
         */
        this.name = name;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
