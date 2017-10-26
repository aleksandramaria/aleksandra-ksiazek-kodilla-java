package com.kodilla.patterns2.adapter.company.oldhrsystem;

import java.math.BigDecimal;

/**
 * Created by ola on 26/10/2017.
 */

public interface SalaryCalculator {
    double totalSalary(String[][] workers, double[] salaries);
}
