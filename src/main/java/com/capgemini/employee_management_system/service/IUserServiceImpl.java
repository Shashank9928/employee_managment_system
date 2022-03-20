package com.capgemini.employee_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.employee_management_system.controller.entity.User;
import com.capgemini.employee_management_system.exception.UserNotFoundException;
import com.capgemini.employee_management_system.reposistory.IUserRepository;



@Service
@Transactional
public class IUserServiceImpl implements IUserService {
  @Autowired
  private IUserRepository login_repo;
  
//*********************************************************************************************************************	
	
	/* Method: addUser 
	 * Description: It adds the user
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the address. 
     */
  
  @Override
  public User addUser(User user) {
	  User user_info=login_repo.save(user);
	  return user_info;
  }
  
//*********************************************************************************************************************	
	
	/* Method: removeUser 
	 * Description: It remove the user
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the address. 
     */
  
  @Override
  public User removeUser(User user) {
	  
	  login_repo.delete(user);
	  return user;
  }
   
//*********************************************************************************************************************	
	
	/* Method: validateUser 
	 * Description: It checks whether the user is valid or not
	 * @Override: It indicates that the child class method is over-writing its base class method.
     * return: It returns the address. 
     */
  
  @Override
  public User validateUser(String id) throws UserNotFoundException {
	  User user_info=login_repo.findByUserId(id);
	  if(user_info==null)
		  throw new UserNotFoundException("User Not Found");
	  return user_info;
  }
}
