package clean.code.design_patterns.requirements;

import java.time.LocalDateTime;

public class Flights {

    private String CompanyName;
    private String NumberPlain;
    private String OneWay;
    private String RoundTrip;
    private String DepartureAirport;
    private String DestinationAirport;
    private LocalDateTime DepartureDateTime;
    private LocalDateTime ArrivalDateTime;
    private int NumbersOfPassengers;
    private double price;

    public Flights(String companyName, String numberPlain, String oneWay, String roundTrip, String departureAirport, String destinationAirport, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, int numbersOfPassengers, double price) {
        CompanyName = companyName;
        NumberPlain = numberPlain;
        OneWay = oneWay;
        RoundTrip = roundTrip;
        DepartureAirport = departureAirport;
        DestinationAirport = destinationAirport;
        DepartureDateTime = departureDateTime;
        ArrivalDateTime = arrivalDateTime;
        NumbersOfPassengers = numbersOfPassengers;
        this.price = price;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setNumberPlain(String numberPlain) {
        NumberPlain = numberPlain;
    }

    public void setOneWay(String oneWay) {
        OneWay = oneWay;
    }

    public void setRoundTrip(String roundTrip) {
        RoundTrip = roundTrip;
    }

    public void setDepartureAirport(String departureAirport) {
        DepartureAirport = departureAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        DestinationAirport = destinationAirport;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        DepartureDateTime = departureDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        ArrivalDateTime = arrivalDateTime;
    }

    public void setNumbersOfPassengers(int numbersOfPassengers) {
        NumbersOfPassengers = numbersOfPassengers;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getNumberPlain() {
        return NumberPlain;
    }

    public String getOneWay() {
        return OneWay;
    }

    public String getRoundTrip() {
        return RoundTrip;
    }

    public String getDepartureAirport() {
        return DepartureAirport;
    }

    public String getDestinationAirport() {
        return DestinationAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return DepartureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return ArrivalDateTime;
    }

    public int getNumbersOfPassengers() {
        return NumbersOfPassengers;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flights { " +
                "CompanyName='" + CompanyName + '\'' +
                ", NumberPlain='" + NumberPlain + '\'' +
                ", OneWay='" + OneWay + '\'' +
                ", RoundTrip='" + RoundTrip + '\'' +
                ", DepartureAirport='" + DepartureAirport + '\'' +
                ", DestinationAirport='" + DestinationAirport + '\'' +
                ", DepartureDateTime=" + DepartureDateTime +
                ", ArrivalDateTime=" + ArrivalDateTime +
                ", NumbersOfPassengers=" + NumbersOfPassengers +
                ", price=" + price +" euro "+
                '}';
    }
}
