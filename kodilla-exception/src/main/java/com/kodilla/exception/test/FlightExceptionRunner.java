package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight chicago = new Flight("chicago");
        Flight sanFrancisco = new Flight("san francisco");

        FlightConnection flightConnection = new FlightConnection();

        try {
            Map<String, Boolean> result = flightConnection.findFlight(sanFrancisco);
            System.out.println("we found your connecting flight: " + result);
        } catch (RouteNotFoundException e) {
            System.out.println("we can't find your connecting flight.");
        } finally {
            System.out.println("thank you for using our services.");
        }
    }
}

