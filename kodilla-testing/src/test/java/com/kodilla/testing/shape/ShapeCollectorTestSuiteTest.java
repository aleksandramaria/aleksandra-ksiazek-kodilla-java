package com.kodilla.testing.shape;

import com.kodilla.testing.com.shape.Circle;
import com.kodilla.testing.com.shape.Shape;
import org.junit.*;

import java.util.ArrayList;

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

        //When
        figures.add(new Circle());

        //Then
        Assert.assertEquals(1, figures.size());
    }
}

