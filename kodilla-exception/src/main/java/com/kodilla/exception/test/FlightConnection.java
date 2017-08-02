package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightConnection {
   public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
       HashMap<String, Boolean> possibleConnections = new HashMap<>();
       possibleConnections.put("san Francisco", true);
       return possibleConnections;
    }
}
