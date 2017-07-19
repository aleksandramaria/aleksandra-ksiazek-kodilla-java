package com.kodilla.testing.com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ola on 19/07/2017.
 */
public class ShapeCollectorTestSuiteTest {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        figures.add(new Circle());

        //When
        figures.add(new Circle());

        //Then
        Assert.assertEquals(1, figures.size());
    }
}

