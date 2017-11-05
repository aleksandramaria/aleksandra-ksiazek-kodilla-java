package com.kodilla.patterns2.facade.employees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ola on 30/10/2017.
 */

@Service
public class EmployeeFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeFacade.class);

    public List<Company> getForName(String name) throws NameFindProcessingException {
        if (companyDao.getForFragmentName(name).size() != 0) {
            LOGGER.info("company found");
            return companyDao.getForFragmentName("%" + name + "%");
        }
        throw new NameFindProcessingException(NameFindProcessingException.ERR_NOCOMPANY_ERROR);
    }

    public List<Employee> getForFirstName(String name) throws NameFindProcessingException {
        if (employeeDao.getForFragmentName(name).size() != 0) {
            LOGGER.info("employee found");
            return employeeDao.getForFragmentName("%" + name + "%");
        }
        throw new NameFindProcessingException(NameFindProcessingException.ERR_NOPERSON_ERROR);
    }
}

//    public List<Employee> getForFirstName(String name) throws NameFindProcessingException {
//        if (employeeDao.getForFragmentName(name).size() == 0) {
//            throw new NameFindProcessingException(NameFindProcessingException.ERR_NOPERSON_ERROR);
//        }
//        LOGGER.info("employee found");
//        return employeeDao.getForFragmentName("%" + name + "%");
//    }