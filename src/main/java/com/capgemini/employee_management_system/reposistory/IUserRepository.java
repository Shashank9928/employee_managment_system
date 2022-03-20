package com.capgemini.employee_management_system.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.employee_management_system.controller.entity.User;


/*/*****************************************************************************
 *ILogin Controller Class 
 *
 * Created By: Created By: Amey Pethkar
 *              
 *******************************************************************************/

public interface IUserRepository extends JpaRepository<User,String> {
	public User addUser(User user);
	public User removeUser(User user);
	public User validateUser(User user);
	public User signOut(User user);
	public User findByUserId(String id);
}
