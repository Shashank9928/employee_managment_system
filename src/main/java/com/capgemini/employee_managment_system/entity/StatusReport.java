package com.capgemini.employee_managment_system.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**********************************************************************************************
 * - @author Shashank Mathur
 * - @Description: This is a StatusReport Entity class which is mapped to the
 * database table
 * StatusReport.
 * - @since: 17-03-2021
 * - @version: 1.0
 * - @Last modified by: Shashank Mathur
 * - @Last modified time: 17-03-2021
 * 
 **********************************************************************************************/

@Entity
@Table(name = "StatusReport")
public class StatusReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_report_id")
    private int statusReportId;
    private String comments;
    private String details;
    private LocalDate createdDate = LocalDate.now();

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "compliance_id", referencedColumnName = "compliance_id")
    private Compliance compliance;

    public StatusReport() {
        // TODO Auto-generated constructor stub
    }

    public StatusReport(String comments, String details, LocalDate createdDate, User user,
            Department department, Compliance compliance) {

        /**
         * @param comments
         * @param details
         * @param createdDate
         * @param user
         * @param department
         * @param compliance
         * 
         *                    Constructor for StatusReport class which is used to create
         *                    a new object of StatusReport class
         *                    with parameters
         *                    comments,details,createdDate,user,department,compliance
         *                    to assign value to the variables of StatusReport class
         *                    while creating
         *                    object of StatusReport class
         */

        this.comments = comments;
        this.details = details;
        this.createdDate = createdDate;
        this.user = user;
        this.department = department;
        this.compliance = compliance;
    }

    /**
     * @return int return the statusReportId
     */
    public int getStatusReportId() {
        return statusReportId;
    }

    /**
     * @param statusReportId the statusReportId to set
     */
    public void setStatusReportId(int statusReportId) {
        this.statusReportId = statusReportId;
    }

    /**
     * @return String return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return String return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * @return LocalDate return the createdDate
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
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
     * @return Compliance return the compliance
     */
    public Compliance getCompliance() {
        return compliance;
    }

    /**
     * @param compliance the compliance to set
     */
    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

}
