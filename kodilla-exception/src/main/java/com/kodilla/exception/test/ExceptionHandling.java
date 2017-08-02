package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) throws Exception {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("oopsie! wrong numbers...");
        } finally {
            System.out.println("THE END");
        }
    }
}
