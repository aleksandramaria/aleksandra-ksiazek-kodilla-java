package Airline;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ola on 09/08/2017.
 */
public final class FlightDirectory {
    private final Set<Flight> flightConnections = new HashSet<>();

    public FlightDirectory() {
        flightConnections.add(new Flight("Katowice", "London"));
        flightConnections.add(new Flight("Katowice", "Frankfurt"));
        flightConnections.add(new Flight("Katowice", "Milan"));

        flightConnections.add(new Flight("London", "Paris"));
        flightConnections.add(new Flight("London", "Dublin"));
        flightConnections.add(new Flight("London", "Malaga"));

        flightConnections.add(new Flight("Frankfurt", "Bratislava"));
        flightConnections.add(new Flight("Milan", "Nis"));

//        flightConnections.add(new Flight("Katowice", "Malaga"));
//        flightConnections.add(new Flight("Katowice", "Dublin"));
//        flightConnections.add(new Flight("Katowice", "Paris"));
//        flightConnections.add(new Flight("Katowice", "Bratislava"));
//        flightConnections.add(new Flight("Katowice", "Nis"));
    }
    public Set<Flight> getSet() {
        return new HashSet<>(flightConnections);
    }
}
