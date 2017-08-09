package Airline;

import java.util.Set;

/**
 * Created by ola on 09/08/2017.
 */
public class FlightFinder {
    public static void main(String[] args) {
        FlightDirectory theFlightDirectory = new FlightDirectory();

        Set<Flight> fromKatowice = theFlightDirectory.findFlightsFrom("Katowice");
        System.out.println("# possible routes: " + fromKatowice);

        Set<Flight> toNis = theFlightDirectory.findFlightsTo("Nis");
        System.out.println("# possible routes: " + toNis);

        Set<Flight> fromKatowiceToDublin = theFlightDirectory.findFlightFromTo("Katowice", "London", "Dublin");
        System.out.println("# possible routes: " + fromKatowiceToDublin);

    }
}
