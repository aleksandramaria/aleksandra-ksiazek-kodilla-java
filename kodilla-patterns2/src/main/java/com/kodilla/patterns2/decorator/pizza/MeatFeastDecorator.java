package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by ola on 26/10/2017.
 */
public class MeatFeastDecorator extends AbstractPizzaOrderDecorator{
    public MeatFeastDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + pepperoni, chicken and beef";
    }
}
