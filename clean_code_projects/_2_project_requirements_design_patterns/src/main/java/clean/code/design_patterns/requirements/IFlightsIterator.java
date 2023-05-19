package clean.code.design_patterns.requirements;

public interface IFlightsIterator {


    boolean hasNext();
    public String getFlightDuration(Flights flight1, Flights flight2);
    public String small_price(Flights flight1, Flights flights2);
    Flights next();
}
