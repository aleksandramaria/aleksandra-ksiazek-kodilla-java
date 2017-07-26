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

/* public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();
    public BookDirectory() {
            theBookList.add(new Book("Dylan Murphy", "Wolf of the mountain",
                   2003, "0001"));
            theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams",
                   2012, "0002"));
            theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven",
                   2001, "0003"));
            theBookList.add(new Book("Aimee Murphy", "Rejecting the night",
                   2015, "0004"));
            theBookList.add(new Book("Ryan Talley", "Gangsters and kings",
                   2007, "0005"));
            theBookList.add(new Book("Madelynn Carson", "Unity without duty",
                   2007, "0006"));
            theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity",
                   2009, "0007"));
    }

    public List<Book> getList() {
            return new ArrayList<>(theBookList);
    }
} */
