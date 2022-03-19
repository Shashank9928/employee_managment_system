package employee_management_system.dto;

import java.time.LocalDate;

/*****************************************************************************
 * IEmployee Employee dto Class 
 * Created By: Lakshita Mathur
 * Date:19/03/2022 
 *******************************************************************************/

import employee_management_system.entity.Employee;

//Used for data transfer
public class Employeedto {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate dateOfBirth;

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
	public void setdateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
