package com.kodilla.patterns2.facade.employees;

import org.aspectj.lang.annotation.Aspect;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by ola on 05/11/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeFacadeTestSuite {
    @Autowired
    private EmployeeFacade employeeFacade;

    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    @Test
    public void testCompanyName() throws NameFindProcessingException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        try {
            employeeFacade.getForName("achi");
        } catch (NameFindProcessingException e) {
            //handling a problem
        }

        //Then
        List<Company> achiCompanies = employeeFacade.getForName("achi");
        System.out.println("number of returns: " + achiCompanies.size());

        try {
            Assert.assertEquals(1, achiCompanies.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        }
    }

    @Test
    public void testEmployeeName() throws NameFindProcessingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();

        //When
        try {
            employeeFacade.getForFirstName("lin");
        } catch (NameFindProcessingException e) {
            //
        }

        //Then
        List<Employee> linEmployees = employeeFacade.getForFirstName("lin");
        Assert.assertEquals(1, linEmployees.size());
        System.out.println("number of returns: " + linEmployees.size());

        //CleanUp
        try {
            employeeDao.delete(johnSmithId);
            employeeDao.delete(stephanieClarcksonId);
            employeeDao.delete(lindaKovalskyId);
        }
        finally {
            //do nothing
        }
    }
}

//        try {
//                Assert.assertEquals(1, linEmployees.size());
//                }
//                finally {
//                //CleanUp
//                employeeDao.delete(johnSmithId);
//                employeeDao.delete(stephanieClarcksonId);
//                employeeDao.delete(lindaKovalskyId);
//                }
//                }