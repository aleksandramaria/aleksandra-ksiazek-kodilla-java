package com.kodilla.patterns2.facade.employees;

/**
 * Created by ola on 30/10/2017.
 */
public class OrderProcessingException extends Exception {
    public static String ERR_NOPERSON_ERROR = "Cannot find the employee";
    public static String ERR_NOCOMPANY_ERROR = "Cannot find the company";

    public OrderProcessingException(String message) {
        super(message);
    }
}
