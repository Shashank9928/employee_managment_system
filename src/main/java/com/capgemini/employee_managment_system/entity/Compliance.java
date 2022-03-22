package com.capgemini.employee_managment_system.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**********************************************************************************************
 * - @author Shashank Mathur
 * - @Description: This is a Compliance Entity class which is mapped to the
 * database table Compliance.
 * - @since: 17-03-2021
 * - @version: 1.0
 * - @Last modified by: Shashank Mathur
 * - @Last modified time: 17-03-2021
 * 
 **********************************************************************************************/
@Entity
@Table(name = "Compliance")
public class Compliance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "compliance_id")
    private int complianceId;
    private String complianceType;
    private String complianceDescription;
    private LocalDate complianceDate = LocalDate.now();
    private int employeeCount;
    private int stsCount;
    private String complianceStatus;
    private int d_id;
    private int u_id;

    @OneToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    public Compliance() {
        // TODO Auto-generated constructor stub
    }

    public Compliance(String complianceType, String complianceDescription,
            int employeeCount, int stsCount, String complianceStatus) {
        /**
         * @param complianceType
         * @param complianceDescription
         * @param employeeCount
         * @param stsCount
         * @param complianceStatus
         * 
         *                              Constructor for Compliance class which is used
         *                              to create a new object of Compliance class with
         *                              parameters complianceType,
         *                              complianceDescription, complianceDate,
         *                              employeeCount, stsCount, complianceStatus to
         *                              assign values to the variables
         *                              of Compliance class
         * 
         */

        this.complianceType = complianceType;
        this.complianceDescription = complianceDescription;
        this.employeeCount = employeeCount;
        this.stsCount = stsCount;
        this.complianceStatus = complianceStatus;
    }

    /**
     * @return int return the complianceId
     */
    public int getComplianceId() {
        return complianceId;
    }

    /**
     * @param complianceId the complianceId to set
     */
    public void setComplianceId(int complianceId) {
        this.complianceId = complianceId;
    }

    /**
     * @return String return the complianceType
     */
    public String getComplianceType() {
        return complianceType;
    }

    /**
     * @param complianceType the complianceType to set
     */
    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * @return String return the complianceDescription
     */
    public String getComplianceDescription() {
        return complianceDescription;
    }

    /**
     * @param complianceDescription the complianceDescription to set
     */
    public void setComplianceDescription(String complianceDescription) {
        this.complianceDescription = complianceDescription;
    }

    /**
     * @return LocalDate return the complianceDate
     */
    public LocalDate getComplianceDate() {
        return complianceDate;
    }

    /**
     * @param complianceDate the complianceDate to set
     */
    public void setComplianceDate(LocalDate complianceDate) {
        this.complianceDate = complianceDate;
    }

    /**
     * @return int return the employeeCount
     */
    public int getEmployeeCount() {
        return employeeCount;
    }

    /**
     * @param employeeCount the employeeCount to set
     */
    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    /**
     * @return int return the stsCount
     */
    public int getStsCount() {
        return stsCount;
    }

    /**
     * @param stsCount the stsCount to set
     */
    public void setStsCount(int stsCount) {
        this.stsCount = stsCount;
    }

    /**
     * @return String return the complianceStatus
     */
    public String getComplianceStatus() {
        return complianceStatus;
    }

    /**
     * @param complianceStatus the complianceStatus to set
     */
    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    /**
     * @return Department return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * @return String return the d_id
     */
    public int getD_id() {
        return d_id;
    }

    /**
     * @param d_id the d_id to set
     */
    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    /**
     * @return int return the u_id
     */
    public int getU_id() {
        return u_id;
    }

    /**
     * @param u_id the u_id to set
     */
    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    /**
     * @return User return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

}
