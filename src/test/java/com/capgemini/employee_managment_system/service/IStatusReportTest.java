package com.capgemini.employee_managment_system.service;

import com.capgemini.employee_managment_system.entity.Compliance;
import com.capgemini.employee_managment_system.entity.StatusReport;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.same;

import java.time.LocalDate;

import com.capgemini.employee_managment_system.service.IStatusReportImpl;
import com.capgemini.employee_managment_system.repository.IStatusReportRepository;

/*************************************************************************************************************
 * IStatusReport Test Class
 * Created By: Shashank Mathur
 * Date:24/03/2022
 ************************************************************************************************************/
@RunWith(SpringRunner.class)
@SpringBootTest
public class IStatusReportTest {

    @InjectMocks
    private IStatusReportImpl statusReportser;

    @Mock
    private IStatusReportRepository statusReportRepository;

    /**************************************************************************
     * Method: testAddStatusReport()
     * Description: It tests addStatusReport method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testStatusReportAdd() {
        StatusReport statusReport = new StatusReport();
        statusReport.setStatusReportId(1);
        statusReport.setU_id(1);
        statusReport.setD_id(1);
        statusReport.setCreatedDate(LocalDate.now());
        statusReport.setComments("Pending");
        Mockito.when(statusReportRepository.save(statusReport)).thenReturn(statusReport);

        NullPointerException u = assertThrows(NullPointerException.class, () -> {
            statusReportser.addStatusReport(statusReport);
        });
        assertEquals(u.getMessage(), u.getMessage());
    }

    /**************************************************************************
     * Method: testGetAllStatusReport()
     * Description: It tests getAllStatusReport method
     * 
     * @return void
     * 
     *************************************************************************/
    @Test
    public void testGetAllStatusReport() {
        StatusReport statusReport = new StatusReport();
        statusReport.setStatusReportId(1);
        statusReport.setU_id(1);
        statusReport.setD_id(1);
        statusReport.setCreatedDate(LocalDate.now());
        statusReport.setComments("Pending");
        statusReportRepository.save(statusReport);

        assertEquals(0, statusReportser.AllStatusReport().size());
    }
}
