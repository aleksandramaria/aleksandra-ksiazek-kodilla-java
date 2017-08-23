package com.kodilla.patterns.builder.bigmac;


import org.junit.Assert;
import org.junit.Test;

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
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
