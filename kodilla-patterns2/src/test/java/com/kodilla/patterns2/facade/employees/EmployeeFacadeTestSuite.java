package com.kodilla.patterns2.facade.employees;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ola on 05/11/2017.
 */
public class EmployeeFacadeTestSuite {
    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void testCompanyName() throws NameFindProcessingException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        try {
            employeeFacade.getForName("achi");
        } catch (NameFindProcessingException e) {
            //handling a problem
        }

        //Then
        List<Company> achiCompanies = employeeFacade.getForName("achi");
        Assert.assertEquals(1, achiCompanies.size());
    }

    @Test
    public void testEmployeeName() throws NameFindProcessingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        try {
            employeeFacade.getForFirstName("lin");
        } catch (NameFindProcessingException e) {
            //
        }

        //Then
        List<Employee> linEmployees = employeeFacade.getForFirstName("lin");
        Assert.assertEquals(1, linEmployees.size());
    }
}
