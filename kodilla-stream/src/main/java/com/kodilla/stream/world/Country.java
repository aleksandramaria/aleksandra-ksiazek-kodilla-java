package com.kodilla.stream.world;

import java.math.BigDecimal;

/**
 * Created by ola on 24/07/2017.
 */
public final class Country {
    private final BigDecimal peopleQuantity;

    public Country(final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }
    public BigDecimal getPeopleQuantity() {
        return this.peopleQuantity;
    }
    @Override
    public String toString() {
        return "Country{" +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
