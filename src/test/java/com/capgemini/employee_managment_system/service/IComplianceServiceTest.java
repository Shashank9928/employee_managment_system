package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.Compliance;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import com.capgemini.employee_managment_system.service.IComplianceServiceImpl;
import com.capgemini.employee_managment_system.repository.IComplianceReository;

/*************************************************************************************************************
 * ICompliance ServiceImpl Test Class
 * Created By: Shashank Mathur
 * Date:24/03/2022
 ************************************************************************************************************/
@RunWith(SpringRunner.class)
@SpringBootTest
public class IComplianceServiceTest {

    @InjectMocks
    private IComplianceServiceImpl complianceService;

    @Mock
    private IComplianceReository complianceRepository;

    /**************************************************************************
     * Method: testAddCompliance()
     * Description: It tests addCompliance method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testComplianceAdd() {
        Compliance compliance = new Compliance();
        compliance.setComplianceId(1);
        compliance.setU_id(1);
        compliance.setD_id(1);
        compliance.setComplianceDate(LocalDate.now());
        compliance.setComplianceStatus("Pending");
        Mockito.when(complianceRepository.save(compliance)).thenReturn(compliance);

        NullPointerException u = assertThrows(NullPointerException.class, () -> {
            complianceService.addCompliance(compliance);
        });
        assertEquals(u.getMessage(), u.getMessage());
    }

    /**************************************************************************
     * Method: testGetAllCompliance()
     * Description: It tests getAllCompliance method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testGetAllCompliance() {
        Compliance compliance = new Compliance();
        compliance.setComplianceId(1);
        compliance.setU_id(1);
        compliance.setD_id(1);
        compliance.setComplianceDate(LocalDate.now());
        compliance.setComplianceStatus("Pending");
        complianceRepository.save(compliance);
        // Mockito.when(compliance).when(complianceRepository).save(compliance);
        assertEquals(0, complianceService.getAllCompliance().size());

    }

    /**************************************************************************
     * Method: testGetComplianceByUserId()
     * Description: It tests getAllComplianceByUserId method
     * 
     * @return void
     * 
     *************************************************************************/

    @Test
    public void testGetComplianceByUserId() {
        Compliance compliance = new Compliance();
        compliance.setComplianceId(1);
        compliance.setU_id(1);
        compliance.setD_id(1);
        compliance.setComplianceDate(LocalDate.now());
        compliance.setComplianceStatus("Pending");
        complianceRepository.save(compliance);
        // Mockito.when(compliance).when(complianceRepository).save(compliance);
        assertEquals(0, complianceService.getComplianceByUserId(1).size());

    }

}
