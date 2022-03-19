package com.capgemini.employee_management_system.dao;
//Used for data transfer
public class Departmentdao 
{
	private int id;
	private String name;

	public int getDepartId() 
	{
		return id;
	}

	public void setDepartId(int id) 
	{
		this.id = id;
	}

	public String getDepartName() 
	{
		return name;
	}

	public void setDepartName(String departName) 
	{
		this.name = departName;
	}
}
