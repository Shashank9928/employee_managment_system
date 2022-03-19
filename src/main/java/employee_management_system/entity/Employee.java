package employee_management_system.entity;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.CascadeType;


//import javax.validation.constraints.NotNull;

/**********************************************************************************************
 * - @author Shashank Mathur
 * - @Description: This is a Employee Entity class which is mapped to the
 * database table
 * Employee.
 * - @since: 17-03-2021
 * - @version: 1.0
 * - @Last modified by: Shashank Mathur
 * - @Last modified time: 17-03-2021
 * 
 **********************************************************************************************/

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private int u_id;
    private int d_id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee() {
        // TODO Auto-generated constructor stub
    }

    public Employee(String firstName, String lastName, String email, LocalDate dateOfBirth) {
        /**
         * @param firstName
         * @param lastName
         * @param email
         * @param dateOfBirth
         *                    Constructor for Employee class with parameters
         *                    firstName,lastName,
         *                    email,dateOfBirth
         *                    to assign value to the variables of Employee class while
         *                    creating
         *                    object of
         *                    Employee class
         * 
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
   
   
}