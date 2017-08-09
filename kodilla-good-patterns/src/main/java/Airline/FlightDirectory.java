package Airline;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
    }
    public Set<Flight> getSet() {
        return new HashSet<>(flightConnections);
    }

    public Set<Flight> findFlightFromTo(String fromCity, String byCity, String toCity) {

        Flight flightFrom = flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .filter(f -> f.getFlightTo().equals(byCity))
                .findFirst().get();

        Flight flightTo = flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(byCity))
                .filter(f -> f.getFlightTo().equals(toCity))
                .findFirst().get();

        HashSet<Flight> flights = new HashSet<>();
        flights.add(flightFrom);
        flights.add(flightTo);

        return flights;
    }

    public Set<Flight> findFlightsFrom(String fromCity) {
        return flightConnections.stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .collect(Collectors.toSet());
    }
    public Set<Flight> findFlightsTo(String toCity) {
        return flightConnections.stream()
                .filter(f -> f.getFlightTo().equals(toCity))
                .collect(Collectors.toSet());
    }
}
