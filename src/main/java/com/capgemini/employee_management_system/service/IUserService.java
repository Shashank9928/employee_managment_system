package com.capgemini.employee_management_system.service;

import com.capgemini.employee_management_system.controller.entity.User;
import com.capgemini.employee_management_system.exception.UserNotFoundException;

/*/*****************************************************************************
 *ILogin Controller Class 
 *
 * Created By:Created By: Amey Pethkar 
 *              
 *******************************************************************************/

public interface IUserService {
	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(String id)throws UserNotFoundException;
//	public User signOut(User user); 
}

