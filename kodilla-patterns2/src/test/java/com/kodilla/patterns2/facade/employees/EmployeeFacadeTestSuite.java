package com.kodilla.patterns2.facade.employees;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ola on 05/11/2017.
 */
public class EmployeeFacadeTestSuite {
    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void testEmployeeFacade() {
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        try {
            employeeFacade.getForName("achi");
        } catch (NameFindProcessingException e) {
            //handling a problem
        }

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        try {
            employeeFacade.getForFirstName("lin");
        } catch (NameFindProcessingException e) {
            //
        }

//        List<Company> achiCompanies = employeeFacade.getForName("achi");
//        Assert.assertEquals(3, achiCompanies.size());
    }
}