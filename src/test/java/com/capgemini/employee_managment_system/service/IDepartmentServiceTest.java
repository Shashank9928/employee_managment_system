package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.Department;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.capgemini.employee_managment_system.service.IDepartmentServiceImpl;
import com.capgemini.employee_managment_system.repository.IDepartmentRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*************************************************************************************************************
 * IDepartment ServiceImpl Test Class
 * Created By: Shashank Mathur
 * Date:24/03/2022
 ************************************************************************************************************/

@RunWith(SpringRunner.class)
@SpringBootTest
public class IDepartmentServiceTest {

    @InjectMocks
    private IDepartmentServiceImpl departmentService;

    @Mock
    private IDepartmentRepository idepartmentRepository;

    /**************************************************************************
     * Method: testAddDepartment()
     * Description: It tests addDepartment method
     * 
     * @return void
     * 
     *************************************************************************/

    @Test
    public void testDepartmentAdd() {
        Department department = new Department();
        department.setDepartId(55);
        department.setDepartName("Testing");
        Mockito.doReturn(department).when(idepartmentRepository).save(Mockito.any());

        assertEquals(department.getDepartId(), departmentService.addDepartment(department).getDepartId());
    }

    /**************************************************************************
     * Method: testGetAllDepartment()
     * Description: It tests getAllDepartment method
     * 
     * @return void
     * 
     *************************************************************************/

    @Test
    public void testGetAllDepartment() {
        Department department = new Department();
        department.setDepartId(55);
        department.setDepartName("Testing");
        Mockito.doReturn(department).when(idepartmentRepository).save(Mockito.any());

        assertEquals(0, departmentService.getAllDepartment().size());
    }

    /**************************************************************************
     * Method: testGetAllDepartmentByPagination()
     * Description: It tests getAllDepartmentByPagination method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testGetAllDepartmentByPagination() {
        Department department = new Department();
        department.setDepartId(55);
        department.setDepartName("Testing");
        Mockito.doReturn(department).when(idepartmentRepository).save(Mockito.any());

        assertEquals(0, departmentService.getAllDepartmentByPagination("1").size());
    }

    /**************************************************************************
     * Method: testGetDeparCount()
     * Description: It tests getDeparCount method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testGetDeparCount() {
        Department department = new Department();
        department.setDepartId(55);
        department.setDepartName("Testing");
        Mockito.doReturn(department).when(idepartmentRepository).save(Mockito.any());

        assertEquals(0, departmentService.getDeparCount());
    }

}
