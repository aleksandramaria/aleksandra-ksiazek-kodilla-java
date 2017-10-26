package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by ola on 26/10/2017.
 */
public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
    @Override
    public String getDescription() {
        return "pizza margarita";
    }
}
