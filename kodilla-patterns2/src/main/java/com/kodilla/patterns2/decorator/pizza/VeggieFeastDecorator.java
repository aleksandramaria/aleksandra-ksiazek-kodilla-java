package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by ola on 26/10/2017.
 */

public class VeggieFeastDecorator extends AbstractPizzaOrderDecorator{
    public VeggieFeastDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(11));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sweetcorn, mushroom, courgettes, aubergine";
    }
}
