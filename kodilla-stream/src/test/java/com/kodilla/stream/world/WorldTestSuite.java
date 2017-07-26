package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 24/07/2017.
 */
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
    //Given
    //Create countries
    Country poland = new Country(new BigDecimal("1000000001"));
    Country france = new Country(new BigDecimal("1000000001"));
    Country england = new Country(new BigDecimal("1000000001"));
    Country brazil = new Country(new BigDecimal("1000000001"));
    Country chile = new Country(new BigDecimal("1000000001"));
    Country peru = new Country(new BigDecimal("1000000001"));
    Country sudan = new Country(new BigDecimal("1000000001"));
    Country egypt = new Country(new BigDecimal("1000000001"));
    Country tanzania = new Country(new BigDecimal("1000000001"));

    Continent europe = new Continent();
    Continent southAmerica = new Continent();
    Continent africa = new Continent();

    World world = new World();

    europe.addCountry(poland);
    europe.addCountry(france);
    europe.addCountry(england);

    southAmerica.addCountry(brazil);
    southAmerica.addCountry(chile);
    southAmerica.addCountry(peru);

    africa.addCountry(sudan);
    africa.addCountry(egypt);
    africa.addCountry(tanzania);

    world.addContinent(europe);
    world.addContinent(southAmerica);
    world.addContinent(africa);

    //When
        BigDecimal expectedResult = new BigDecimal("9000000009");

    //Then
    Assert.assertEquals(expectedResult, world.getPeopleQuantity());

    }
}

