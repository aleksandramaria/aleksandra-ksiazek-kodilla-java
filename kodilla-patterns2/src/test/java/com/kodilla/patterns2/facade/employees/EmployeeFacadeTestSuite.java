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
    public void testCompanyName() {
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        try {
            employeeFacade.getForName("achi");
        } catch (NameFindProcessingException e) {
            //handling a problem
        }
    }

    @Test
    public void testEmployeeNmae() throws NameFindProcessingException {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        try {
            employeeFacade.getForFirstName("lin");
        } catch (NameFindProcessingException e) {
            //
        }
    }
}

//        //Then
//        List<Company> achiCompanies = employeeFacade.getForFirstName("achi");
//        Assert.assertEquals(1, achiCompanies.size());
//    }
//}
