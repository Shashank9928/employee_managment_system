package com.capgemini.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.employee_managment_system.entity.User;
import com.capgemini.employee_managment_system.exception.UserNotFoundException;

/*/*****************************************************************************
 *IUserRepository interface is used to perform CRUD operations on User entity. 
 *
 * Created By: Amey Pethkar 
 *              
 *******************************************************************************/
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public User findById(int id);

    public User findByUserNameAndPassword(String userName, String password) throws UserNotFoundException;

    public User deleteById(int id);
}