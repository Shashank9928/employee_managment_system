package com.capgemini.employee_management_system.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employee_management_system.controller.entity.User;
import com.capgemini.employee_management_system.exception.UserNotFoundException;
import com.capgemini.employee_management_system.service.IUserService;


/*/*****************************************************************************
 *ILogin Controller Class 
 *
 * Created By: Amey Pethkar 
 *              
 *******************************************************************************/

@RequestMapping(value={"/loginController"})
@RestController
public class ILoginController {
	private static final HttpStatus HttpStatus = null;

	@Autowired
	HttpSession session;

	@Autowired
	private IUserService loginservice;
	

	/* Method: addUser
	 * Description: It allows to add the User.
	 * @RequestMapping: It is used to map HTTP requests to handler methods of MVC and REST controllers.
	 * @RestController: It is used to create RESTful web services using MVC.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     */
	//http://localhost:9090/loginController/addUser
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		if(user.getUserId()==null)
			
			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
		
		User userImpl=loginservice.addUser(user);
		
		return new ResponseEntity(userImpl,HttpStatus.OK);
	}
	//ResponseEntity :
//*********************************************************************************************************************	
	
	/* Method: removeUser
	 * Description: It allows to remove the user.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
     */
	//http://localhost:9090/loginController/removeUser
	
	@DeleteMapping("/removeUser")
	public ResponseEntity<User> removeUser(@RequestBody User user){
		if(user.getUserId()==null)
			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
		
		User userImpl=loginservice.removeUser(user);
		return new ResponseEntity(userImpl,HttpStatus.OK);
		
	}

//*********************************************************************************************************************	
	
	/* Method: getUserById
	 * Description: It allows to view the user by id.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
     */
	//http://localhost:9090/loginController/getUser/1
		
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") String id)throws UserNotFoundException{
		User userImpl=loginservice.validateUser(id);
		return new ResponseEntity("User is Valid",HttpStatus.OK);
	}
	
//*********************************************************************************************************************	
	
	/* Method: signout
	 * Description: It allows to singout the user.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
     */
	//http://localhost:9090/loginController/signOut
	
	@GetMapping("/signOut")
	public ResponseEntity<User> signOut(){
		session.invalidate();
		return new ResponseEntity("LoggedOut",HttpStatus.OK);
	}
	
}

