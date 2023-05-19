package clean.code.design_patterns.requirements;

import java.time.LocalDateTime;

public class FlightsBuilder {
    private String companyName;
    private String numberPlain;
    private String oneWay;
    private String roundTrip;
    private String departureAirport;
    private String destinationAirport;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private int numbersOfPassengers;
    private double price;

    public FlightsBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public FlightsBuilder setNumberPlain(String numberPlain) {
        this.numberPlain = numberPlain;
        return this;
    }

    public FlightsBuilder setOneWay(String oneWay) {
        this.oneWay = oneWay;
        return this;
    }

    public FlightsBuilder setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
        return this;
    }

    public FlightsBuilder setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
        return this;
    }

    public FlightsBuilder setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
        return this;
    }

    public FlightsBuilder setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
        return this;
    }

    public FlightsBuilder setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
        return this;
    }

    public FlightsBuilder setNumbersOfPassengers(int numbersOfPassengers) {
        this.numbersOfPassengers = numbersOfPassengers;
        return this;
    }

    public FlightsBuilder setPrice(double price) {
        this.price = price;
        return this;
    }
    public Flights build() {
        return new Flights(companyName, numberPlain, oneWay, roundTrip, departureAirport, destinationAirport, departureDateTime, arrivalDateTime, numbersOfPassengers, price);
    }

}