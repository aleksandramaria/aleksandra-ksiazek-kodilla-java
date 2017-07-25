package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 24/07/2017.
 */
public final class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }
    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
