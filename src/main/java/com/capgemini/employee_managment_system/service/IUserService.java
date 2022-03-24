package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.User;
import java.util.List;

/*/*****************************************************************************
 * IUserService interface is used to perform CRUD operations on User entity.
 *
 * Created By: Amey Pethkar 
 *              
 *******************************************************************************/

public interface IUserService {

    public User addUser(User user);

    public User login(User user);

    public List<User> getAllUsers();

    public User getUserById(int id);

    public User removeUser(int id);

}
