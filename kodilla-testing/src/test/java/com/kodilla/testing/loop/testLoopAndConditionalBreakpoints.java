package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ola on 22/11/2017.
 */
public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoop() {
        //given
        long sum = 0;
        //when
        for (int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("[" + n + "]" + " sum equals: " + sum);
        }
        //then
        Assert.assertEquals(499500, sum);
    }
}
