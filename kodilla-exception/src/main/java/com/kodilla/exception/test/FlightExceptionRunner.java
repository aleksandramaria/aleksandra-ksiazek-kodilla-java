package com.kodilla.exception.test;


public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight flight = null;
        FlightConnection flightConnection = new FlightConnection();

        try {
            flightConnection.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("we can't find your connecting flight.");
        } finally {
            System.out.println("thank you for using our services.");
        }
    }
}


