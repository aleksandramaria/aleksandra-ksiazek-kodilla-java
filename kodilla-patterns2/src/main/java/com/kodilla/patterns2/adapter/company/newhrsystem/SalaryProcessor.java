package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ola on 26/10/2017.
 */

public interface SalaryProcessor {
    BigDecimal calculateSalaries(List<Employee> employees);
}
