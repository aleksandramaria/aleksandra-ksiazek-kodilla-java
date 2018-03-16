package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightConnection {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> possibleConnections = new HashMap<>();
        possibleConnections.put("san francisco", true);
        possibleConnections.put("chicago", false);

        Boolean isPossible = possibleConnections.get(flight.getDepartureAirport());

        if(isPossible == null) {
            throw new RouteNotFoundException("Not found");
        }

        return isPossible;
    }
}

