package Airline;


import java.util.HashSet;
import java.util.Set;

public final class Flight {
    private final String flightFrom;
    private final String flightTo;
    private final Set<Flight> flightConnections = new HashSet<>();

    public Flight(final String flightFrom, final String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public void addFlight(Flight flight) {
        flightConnections.add(flight);
    }

    public boolean removeFlight(Flight flight) {
        return flightConnections.remove(flight);
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public Set<Flight> getFlightConnections() {
        return flightConnections;
    }

    @Override
    public String toString() {
        return "flightFrom ='" + flightFrom + '\'' +
                ", flightTo ='" + flightTo + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getFlightFrom().equals(flight.getFlightFrom())) return false;
        if (!getFlightTo().equals(flight.getFlightTo())) return false;
        return getFlightConnections().equals(flight.getFlightConnections());
    }

    @Override
    public int hashCode() {
        int result = getFlightFrom().hashCode();
        result = 31 * result + getFlightTo().hashCode();
        result = 31 * result + getFlightConnections().hashCode();
        return result;
    }
}