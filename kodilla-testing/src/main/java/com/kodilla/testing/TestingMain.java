package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) throws java.lang.Exception {
        Calculator calculator = new Calculator();
        int resultOfAdding = calculator.addAToB(8, 2);
        int resultOfSubtracting = calculator.subtractAFromB(8, 2);

        if (resultOfAdding == 10) {
            System.out.println("adding methos works");
        } else {
            System.out.println("boo :(");
        }

        if (resultOfSubtracting == 6) {
            System.out.println("subtracting method works");
        } else {
            System.out.println("boo :(");
        }

    }
}
