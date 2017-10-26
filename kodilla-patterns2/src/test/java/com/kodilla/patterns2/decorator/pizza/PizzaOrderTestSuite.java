package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by ola on 26/10/2017.
 */


public class PizzaOrderTestSuite {
    @Test
    public void testMeatyAndVeggiePizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatFeastDecorator(theOrder);
        theOrder = new VeggieFeastDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(41), theCost);
    }

    @Test
    public void testMeatyAndVeggiePizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatFeastDecorator(theOrder);
        theOrder = new VeggieFeastDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("pizza margarita + extra cheese + pepperoni, chicken and beef + sweetcorn, mushroom, courgettes, aubergine", description);
    }
}
