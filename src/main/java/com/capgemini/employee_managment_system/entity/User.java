package com.capgemini.employee_managment_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**********************************************************************************************
 * - @author Shashank Mathur
 * - @Description: This is a Users Entity class which is mapped to the
 * database table
 * Users.
 * - @since: 17-03-2021
 * - @version: 1.0
 * - @Last modified by: Shashank Mathur
 * - @Last modified time: 17-03-2021
 * 
 **********************************************************************************************/

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;
    private String userName;
    private String password;
    private String role;
    private int result;

    public User() {
        // TODO Auto-generated constructor stub
    }

    public User(String userName, String password, String role, int result) {
        /*
         * @author Shashank Mathur
         * 
         * @Description: This is a parameterized constructor which is used to
         * initialize the instance variables.
         * 
         * @param userName
         * 
         * @param password
         * 
         * @param role
         * 
         * @param result
         * 
         * @since 17-03-2021
         * 
         * @version 1.0
         * 
         * @Last modified by Shashank Mathur
         * 
         * @Last modified time 17-03-2021
         */
        super();
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.result = result;
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
     * @return String return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return String return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return int return the result
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }

}
