package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame seeds")
                .burgers(2)
                .sauce("bbq")
                .ingredient("prawns")
                .ingredient("cheese")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whichRoll = bigmac.getRoll();
        //Then
        assertEquals(5, howManyIngredients);
        assertEquals("sesame seeds", whichRoll);
    }
}
