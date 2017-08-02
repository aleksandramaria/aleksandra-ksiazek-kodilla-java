package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;


public class FlightConnection {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> possibleConnections = new HashMap<>();
        possibleConnections.put("san Francisco", true);
        possibleConnections.put("chicago", false);

        Boolean isPossible = possibleConnections.get(flight.getDepartureAirport());

        if(isPossible == null) {
            throw new RouteNotFoundException("Not found");
        }

        return isPossible;
    }
}



//public class FlightConnection {
//    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
//        HashMap<String, Boolean> possibleConnections = new HashMap<>();
//        possibleConnections.put("san Francisco", true);
//
//        for(Map.Entry<String, Boolean> entry : possibleConnections.entrySet()) {
//            if (entry.getKey() != null || entry.getValue() != false) {
//                return possibleConnections; }
//        } throw new RouteNotFoundException("Object flight was null or entry value false");
//    }
//}
