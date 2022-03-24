package com.capgemini.employee_managment_system.service;

import java.util.List;

import com.capgemini.employee_managment_system.entity.User;
import com.capgemini.employee_managment_system.exception.UserNotFoundException;
import com.capgemini.employee_managment_system.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*/*****************************************************************************
 *IUserService interface is used to perform CRUD operations on User entity.
 *
 * Created By: Amey Pethkar 
 *              
 *******************************************************************************/
@Service
@Transactional
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iuserrepository;

    /*
     * Method: addUser
     * Description: It adds the user
     * 
     * @Override: It indicates that the child class method is over-writing its base
     * class method.
     * return: It returns the user.
     */

    @Override
    public User addUser(User user) {
        User user_info = iuserrepository.save(user);
        return user_info;
    }

    /*
     * Method: login
     * Description: It allows to login the user.
     * 
     * @RequestBody: It is used to bind HTTP request body with a domain object in
     * method parameter or return type
     */
    @Override
    public User login(User user) {
        User user_info = new User();
        try {
            user_info = iuserrepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
        return user_info;
    }

    /*
     * Method: getAllUsers
     * Description: It returns all the users
     * 
     * @Override: It indicates that the child class method is over-writing its base
     * class method.
     * return: It returns the list of users.
     */
    @Override
    public List<User> getAllUsers() {
        List<User> user_info = iuserrepository.findAll();
        return user_info;
    }

    /*
     * Method: getUserById
     * Description: It returns the user by id
     * 
     * @Override: It indicates that the child class method is over-writing its base
     * class method.
     * return: It returns the user.
     */
    @Override
    public User getUserById(int id) {
        User user_info = iuserrepository.findById(id);
        return user_info;
    }

    /*
     * Method: removeUser
     * Description: It removes the user
     * 
     * @Override: It indicates that the child class method is over-writing its base
     * class method.
     * return: It returns the user.
     */
    @Override
    public User removeUser(int id) {
        User user_info = iuserrepository.findById(id);
        iuserrepository.deleteById(id);
        return user_info;
    }
}
