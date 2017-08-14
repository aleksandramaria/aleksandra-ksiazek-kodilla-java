package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        //GIVEN
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator listOne = new OddNumbersExterminator();
        //WHEN
        List<Integer> result = listOne.exterminate(numbers);
        final ArrayList<Integer> expectedResult = new ArrayList<>();
        //THEN
        Assert.assertEquals(expectedResult, result);
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //GIVEN
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        //WHEN
        OddNumbersExterminator listOne = new OddNumbersExterminator();
        List<Integer> result = listOne.exterminate(numbers);
        //THEN
        final ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        Assert.assertEquals(expectedResult, result);
    }
}



