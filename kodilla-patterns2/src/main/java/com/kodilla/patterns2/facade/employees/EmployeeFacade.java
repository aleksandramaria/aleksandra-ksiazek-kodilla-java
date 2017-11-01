package com.kodilla.patterns2.facade.employees;

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

    public List<Company> getForName(String name) {
        return companyDao.getForFragmentName("%" + name + "%");
    }
}
