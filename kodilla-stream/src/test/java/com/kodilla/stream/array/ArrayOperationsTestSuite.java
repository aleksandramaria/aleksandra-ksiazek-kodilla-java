package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by ola on 25/07/2017.
 */
public class ArrayOperationsTestSuite {
    @Test
    //Given
    public void testGetAverage() {
        int[] numbers = new int[20];
        numbers[0] = 2;
        numbers[1] = 6;
        numbers[2] = 5;
        numbers[3] = 9;
        numbers[4] = 11;
        numbers[5] = 3;
        numbers[6] = 4;
        numbers[7] = 22;
        numbers[8] = 17;
        numbers[9] = 11;
        numbers[10] = 8;
        numbers[11] = 10;
        numbers[12] = 12;
        numbers[13] = 1;
        numbers[14] = 31;
        numbers[15] = 26;
        numbers[16] = 44;
        numbers[17] = 43;
        numbers[18] = 34;
        numbers[19] = 60;
    }
    //When
    ArrayOperations.


    //Then
    Assert.assertEquals(17.95, numbers.getAverage(), 0);
}

