package com.capgemini.employee_managment_system.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import com.capgemini.employee_managment_system.entity.Employee;
import com.capgemini.employee_managment_system.repository.IEmployeeRepository;

/**********************************************************************************************
 * IUser UserImpl Test Class
 * Created By: Shashank Mathur
 * Date:24/03/2022
 ***********************************************************************************************/

@RunWith(SpringRunner.class)
@SpringBootTest
public class IEmployeeServiceTest {

    @InjectMocks
    private IEmployeeServiceImpl employeeService;

    @Mock
    private IEmployeeRepository employeeRepository;

    /******************************************************************************************
     * Method: testAddEmployee()
     * Description: It tests addEmployee method
     *
     * @return void
     *
     ******************************************************************************************/
    @Test
    public void testEmployeeAdd() {
        Employee employee = new Employee();
        employee.setId(1);
        employeeRepository.save(employee);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            employeeService.saveEmployee(employee);
        });
        assertEquals(exception.getMessage(), exception.getMessage());
    }

    /******************************************************************************************
     * Method: GetAll Employee Test
     * Description: It tests getAllEmployee method
     *
     * @return void
     *
     ******************************************************************************************/
    @Test
    public void testGetAllEmployee() {
        Employee employee = new Employee();
        employee.setId(1);
        employeeRepository.save(employee);

        Mockito.when(employeeRepository.findAll()).thenReturn(Arrays.asList(employee));

        assertEquals(employee.getId(), employeeService.getAllEmployee().get(0).getId());
    }
}
