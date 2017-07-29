package com.kodilla.testing.shape;

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
        figures.add(new Circle("circle", 2));

        //Then
        Assert.assertEquals(1, figures.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> figures = new ArrayList<>();
        Circle circle = new Circle("circle", 4);
        figures.add(circle);
        Square square = new Square("square", 3);
        figures.add(square);
//        figures.add(new Circle("circle", 2));
//        figures.add(new Square("square", 2));
//        figures.add(new Triangle("triangle", 2, 2, 3, 4));
//
//
//        //When
        figures.remove(circle);
//        figures.remove(new Circle("circle", 2));
//        figures.remove(new Square("square", 2));
//        figures.remove(new Triangle("triangle", 2, 2, 3, 4));

        //Then
        Assert.assertEquals(1, figures.size());
    }
//    @Test
//    public void testGetFigure() {
//        //Given
//        ArrayList<Shape> figures = new ArrayList<>();
//        Circle circle = new Circle("circle", 4);
//        figures.add(circle);
//
//        //When
//        Shape theCircle = figures.getFigure(0);
//
//        //Then
//        Assert.assertEquals(circle, theCircle);
//    }
}
