package com.kodilla.patterns2.facade.employees;


public class NameFindProcessingException extends Exception {
    public static String ERR_NOPERSON_ERROR = "Cannot find the employee";
    public static String ERR_NOCOMPANY_ERROR = "Cannot find the company";

    public NameFindProcessingException(String message) {
        super(message);
    }
}
