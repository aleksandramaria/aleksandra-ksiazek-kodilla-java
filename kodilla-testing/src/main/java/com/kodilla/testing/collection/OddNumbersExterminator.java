package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

/**
 * Created by ola on 17/07/2017.
 */
public class OddNumbersExterminator {

    public int exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumber = new ArrayList();
        int temporaryValue = 0;
        for (int n = 0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);

            if (temporaryValue % 2 == 0) {
                evenNumber.add(temporaryValue);
            }
        }
        return temporaryValue;
    }
}
