package com.capgemini.employee_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.capgemini.employee_managment_system.entity.User;
import com.capgemini.employee_managment_system.service.IUserService;

import java.util.List;

/*/*****************************************************************************
 *ILogin Controller Class 
 *
 * Created By: Amey Pethkar 
 *              
 *******************************************************************************/
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/authentication")
public class ILoginController {

    @Autowired
    private IUserService iuserService;

    /*********************************************************************
     * Method: addUser
     * Description: It adds the user
     * 
     * @pram user: It is used to add the user
     * @return ResponseEntity<User> with status code as HttpStatus.Created
     ********************************************************************/
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User user_info = new User();
        if (user.getUserName() != null && user.getPassword() != null) {
            user_info = iuserService.addUser(user);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(user_info, HttpStatus.CREATED);
    }

    /******************************************************************
     * Method: login
     * Description: It allows to login the user.
     * 
     * @param: user
     * @param: session
     * @return: It returns the user if valid user else returns null.
     ******************************************************************/
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user, HttpSession session) {
        User user_info = iuserService.login(user);
        if (user_info != null) {
            session.setAttribute("user", user_info);
            return new ResponseEntity<>(user_info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /******************************************************************
     * Method: logout
     * Description: It allows to logout the user.
     * 
     * @param: session
     * @return: It returns the user if valid user else returns null.
     ******************************************************************/
    @GetMapping("/logout")
    public ResponseEntity<User> logout(HttpSession session) {
        User user_info = (User) session.getAttribute("user");
        if (user_info != null) {
            session.removeAttribute("user");
            return new ResponseEntity<>(user_info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /******************************************************************
     * Method: getAllUsers
     * Description: It allows to get all the users.
     * 
     * @return: It returns the list of users.
     ******************************************************************/
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> user_info = iuserService.getAllUsers();
        System.out.println(user_info);
        if (user_info.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } else {
            return new ResponseEntity<>(user_info, HttpStatus.OK);
        }
    }

    /***********************************************************************************
     * Method: getUserById
     * Description: It allows to get the user by id.
     * 
     * @param: id
     * 
     * @return: It returns the user.
     * 
     **********************************************************************************/
    @GetMapping("/getUserById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id) {
        User user_info = iuserService.getUserById(id);
        if (user_info != null) {
            return new ResponseEntity<>(user_info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /***********************************************************************************
     * Method: removeUser
     * Description: It allows to remove the user by id.
     * 
     * @param: id
     * 
     * @return: It returns the user.
     * 
     **********************************************************************************/
    @DeleteMapping("/removeUser/{id}")
    public ResponseEntity<User> removeUser(@PathVariable("id") int id) {
        User user_info = iuserService.removeUser(id);
        if (user_info != null) {
            return new ResponseEntity<>(user_info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
