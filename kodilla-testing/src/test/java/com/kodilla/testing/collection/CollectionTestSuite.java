package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

/**
 * Created by ola on 17/07/2017.
 */
public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList () {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(null);

        OddNumbersExterminator listOne = new OddNumbersExterminator();
        int result1 = listOne.exterminate(numbers);
        Assert.assertEquals(null, result1);
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);

        OddNumbersExterminator listOne = new OddNumbersExterminator();
        int result2 = listOne.exterminate(numbers);
        Assert.assertEquals(2, result2);
    }
}



