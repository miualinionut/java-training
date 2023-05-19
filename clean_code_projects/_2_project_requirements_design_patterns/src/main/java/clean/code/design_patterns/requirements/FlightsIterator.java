package clean.code.design_patterns.requirements;
import java.time.Duration;
import java.util.List;

public class FlightsIterator implements IFlightsIterator {

    private int currentIndex = 0;
    private List<Flights> flights;

    public FlightsIterator(List<Flights> flights) {
        this.flights= flights;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < flights.size();
    }

    @Override
    public Flights next() {
        return flights.get(currentIndex++);
    }
    public String getFlightDuration(Flights flight1, Flights flight2) {

        if(flight1.getDestinationAirport()==flight2.getDestinationAirport()&&flight1.getDepartureAirport()==flight2.getDepartureAirport()) {
            Duration duration = Duration.between(flight1.getDepartureDateTime(), flight2.getDepartureDateTime());
            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;

            if (flight2.getArrivalDateTime().isBefore(flight1.getDepartureDateTime())) {
                return "mai devreme cu "+Math.abs(days) + " zile, " + Math.abs(hours) + " ore, " + Math.abs(minutes) + " minute ";
            } else if (days > 0) {
                return "in "+days + " zile, " + hours + " ore, " + minutes + " minute ";
            } else {
                return hours + " ore, " + minutes + " minute ";
            }
        }
             else {
                return "Nu exista zboruri apropiate!!!";
            }
        }
    public String small_price(Flights flight1, Flights flights2)
    {
        if(flight1.getPrice()< flights2.getPrice()&&flight1.getDestinationAirport()==flights2.getDestinationAirport())
        {
            return "Cel mai mic pret cu destinatia " + flight1.getDestinationAirport() +  "  este la compania " +flight1.getCompanyName()+ " si este  " + flight1.getPrice() + " euro"+  " in ziua de "+ flight1.getDepartureDateTime();
        }
        else if(flight1.getPrice()> flights2.getPrice()&&flight1.getDestinationAirport()==flights2.getDestinationAirport()) {
            return "Cel mai mic pret cu destinatia " + flight1.getDestinationAirport() +  "  este la compania " + flights2.getCompanyName()+" si este " + flights2.getPrice()+ " euro"+  " in ziua de "+ flights2.getDepartureDateTime();
        }
        else{
            return "Pretul este acelasi la toate companiile cu destinatia "+ flight1.getDestinationAirport()+ " si este: " + flight1.getPrice() + " euro";
        }
    }

}

