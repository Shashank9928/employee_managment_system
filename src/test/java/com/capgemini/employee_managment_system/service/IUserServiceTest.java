package com.capgemini.employee_managment_system.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.capgemini.employee_managment_system.entity.User;
import com.capgemini.employee_managment_system.exception.UserNotFoundException;
import com.capgemini.employee_managment_system.repository.IUserRepository;

/*************************************************************************************************************
 * IUser UserImpl Test Class
 * Created By: Shashank Mathur
 * Date:24/03/2022
 ************************************************************************************************************/

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserServiceTest {

    @InjectMocks
    private IUserServiceImpl userService;

    @Mock
    private IUserRepository userRepository;

    /**************************************************************************
     * Method: testAddUser()
     * Description: It tests addUser method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testUserAdd() {
        User user = new User();
        user.setId(1);
        user.setUserName("Name");
        user.setPassword("password");
        user.setRole("Admin");
        user.setResult(100);

        Mockito.when(userRepository.save(user)).thenReturn(user);

        assertEquals(user.getId(), userService.addUser(user).getId());
    }

    /**************************************************************************
     * Method: testUserLogIn()
     * Description:
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testUserLogIn() {
        User user = new User();
        user.setId(1);
        user.setUserName("Name");
        user.setPassword("password");
        user.setRole("Admin");
        user.setResult(100);

        assertEquals(null, userService.login(user));
    }

    /**************************************************************************
     * Method: testGetAllUsers()
     * Description: It tests getAllUsers method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testGetAllUsers() {
        User user = new User();
        user.setId(1);
        user.setUserName("Name");
        user.setPassword("password");
        user.setRole("Admin");
        user.setResult(100);
        userRepository.save(user);

        assertEquals(0, userService.getAllUsers().size());
    }

}
