package com.kodilla.stream.world;

import org.junit.Assert;

import java.math.BigDecimal;

/**
 * Created by ola on 24/07/2017.
 */
public class WorldTestSuite {
    //Given
    //Create countries
    Country poland = new Country(new BigDecimal("111232347457395"));
    Country france = new Country(new BigDecimal("85566474573957"));
    Country england = new Country(new BigDecimal("9834805573957");
    Country brazil = new Country(new BigDecimal("113848505673965"));
    Country chile = new Country(new BigDecimal("117583930573957"));
    Country peru = new Country(new BigDecimal("1112323474573957"));
    Country sudan = new Country(new BigDecimal("146535375957"));
    Country egypt = new Country(new BigDecimal("1112323474573957"));
    Country tanzania = new Country(new BigDecimal("17563559043357"));

    Continent europe = new Continent("Europe");


    World world = new World();


    //When
    world.addContinent()(new Continent("Europe").addCountry().(poland))



    //Then
    //assert number of people in the world and on specific countries(?)

}

