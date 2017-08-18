package com.kodilla.patterns.singleton;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logging() {
        System.out.println("logging");
        Logger.getInstance().log("today");
    }
    @AfterClass
    public static void logout() {
        System.out.println("logged out");
    }
    @Test
    public void TestLog() {
        //Given
        //When
        Logger.getInstance().log("yesterday");

        //Then
    }
    @Test
    public void TestGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("today", lastLog);
    }
}
