package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

/**
 * Created by ola on 17/07/2017.
 */
public class OddNumbersExterminator {
    private ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator(){
        evenNumbers = new ArrayList<Integer>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList();

        for (int n = 0; n < numbers.size(); n++) {
            int temporaryValue = numbers.get(n);

            if (temporaryValue % 2 == 0) {
                evenNumbers.add(temporaryValue);
            }
        } return evenNumbers;

    }

}
