package Airline;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by ola on 09/08/2017.
 */
public class FlightFinder {
    public static void main(String[] args) {
        FlightDirectory theFlightDirectory = new FlightDirectory();

        Map<String, Flight> theResultMapOfFlightsFrom = theFlightDirectory.getSet().stream()
                .filter(f -> f.getFlightFrom() == "Katowice")
                .collect(Collectors.toMap(Flight::getFlightTo, flight -> flight));

        System.out.println("# possible routes: " + theResultMapOfFlightsFrom.size());

        theResultMapOfFlightsFrom.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

        Map<String, Flight> theResultMapOfFlightsTo = theFlightDirectory.getSet().stream()
                .filter(f -> f.getFlightTo() == "Nis")
                .collect(Collectors.toMap(Flight::getFlightFrom, flight -> flight));

        System.out.println("# possible routes: " + theResultMapOfFlightsTo.size());

        theResultMapOfFlightsTo.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

        Map<String, Flight> theResultMapOfInterconnectingFlights = theFlightDirectory.getSet().stream()
                .flatMap(f -> f.getFlightTo().stream())
                .filter(f -> f.getFlightTo() == "Paris")
                .filter(f -> f != this)
                .collect(Collectors.toMap(Flight::getFlightFrom, flight -> flight));

        System.out.println("# possible routes: " + theResultMapOfInterconnectingFlights.size());

        theResultMapOfFlightsTo.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
