package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4);

        //When
        boolean figures = shapeCollector.addFigure(circle);

        //Then
        Assert.assertTrue(true);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4);
        Square square = new Square("square", 3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //When
        boolean figures = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(true);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4);

        shapeCollector.addFigure(circle);

        //When
        Shape theCircle = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, theCircle);
    }

    @Test
    public void testShowFigures() {
    }
}
