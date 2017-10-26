package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

/**
 * Created by ola on 26/10/2017.
 */

public interface PizzaOrder {
    BigDecimal getCost();
    String getDescription();
}
