package clean.code.design_patterns.requirements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creăm obiectele de zbor utilizând FlightsBuilder
        Flights builder1 = new FlightsBuilder()
                .setCompanyName("Fly Emirates")
                .setNumberPlain("#7777")
                .setOneWay("Yes")
                .setRoundTrip("No")
                .setDepartureAirport("Madrid")
                .setDestinationAirport("Cluj-Napoca")
                .setDepartureDateTime(LocalDateTime.of(2023, 5, 24, 12, 00))
                .setArrivalDateTime(LocalDateTime.of(2023, 5, 24, 14, 58))
                .setNumbersOfPassengers(1)
                .setPrice(125.0)
                .build();

        Flights builder2 = new FlightsBuilder()
                .setCompanyName("Wizz Air")
                .setNumberPlain("#4FCT7")
                .setRoundTrip("No")
                .setOneWay("Yes")
                .setDepartureAirport("Cluj-Napoca")
                .setDestinationAirport("Madrid")
                .setDepartureDateTime(LocalDateTime.of(2023, 5, 21, 15, 30))
                .setArrivalDateTime(LocalDateTime.of(2023, 5, 21, 17, 30))
                .setNumbersOfPassengers(1)
                .setPrice(175.0)
                .build();

        Flights builder3 = new FlightsBuilder()
                .setCompanyName("Turkish Airline")
                .setNumberPlain("F7456")
                .setRoundTrip("Yes")
                .setOneWay("No")
                .setDepartureAirport("Madrid")
                .setDestinationAirport("Cluj-Napoca")
                .setDepartureDateTime(LocalDateTime.of(2023, 5, 27, 15, 30))
                .setArrivalDateTime(LocalDateTime.of(2023, 5, 27, 17, 30))
                .setNumbersOfPassengers(1)
                .setPrice(150.0)
                .build();

        Flights builder4 = new FlightsBuilder()
                .setCompanyName("Wizz Air")
                .setNumberPlain("#4FCT7")
                .setRoundTrip("No")
                .setOneWay("Yes")
                .setDepartureAirport("Madrid")
                .setDestinationAirport("Cluj-Napoca")
                .setDepartureDateTime(LocalDateTime.of(2023, 5, 21, 15, 30))
                .setArrivalDateTime(LocalDateTime.of(2023, 5, 21, 17, 30))
                .setNumbersOfPassengers(1)
                .setPrice(175.0)
                .build();

        List<Flights> flightsList = new ArrayList<>();
        flightsList.add(builder1);
        flightsList.add(builder2);
        flightsList.add(builder3);
        flightsList.add(builder4);

        FlightsIterator iterator1=new FlightsIterator(flightsList);
        while(iterator1.hasNext()){
            Flights flight=iterator1.next();
            if (flight.getDestinationAirport() == "Madrid" && flight.getDepartureAirport().equals("Madrid")) {
                throw new RuntimeException("Aeroportul de destinatie este acelasi cu aeroportul de plecare!!!");
            }
        }

        FlightsIterator iterator = new FlightsIterator(flightsList);
        String smallPrice = null;
        while (iterator.hasNext()) {
            Flights currentFlight = iterator.next();
            if(currentFlight.getDepartureAirport().equals("Madrid")&&currentFlight.getDestinationAirport().equals("Cluj-Napoca")) {
                String destination = currentFlight.getDestinationAirport();
                boolean hasCloseFlights = false;
                FlightsIterator innerIterator = new FlightsIterator(flightsList);
                while (innerIterator.hasNext()) {
                    Flights nextFlight = innerIterator.next();
                    if (nextFlight.getDestinationAirport().equals(destination) && nextFlight != currentFlight) {
                        String flightDuration = iterator.getFlightDuration(currentFlight, nextFlight);
                        System.out.println(currentFlight);
                        System.out.println("Pentru destinatia " + currentFlight.getDestinationAirport() + " exista un zbor cu aceeasi destinatie " + flightDuration + "la " + nextFlight.getCompanyName() + " cu pretul de " + nextFlight.getPrice() + " euro");
                        System.out.println(nextFlight+"\n");
                        hasCloseFlights = true;
                        smallPrice = innerIterator.small_price(currentFlight, nextFlight);
                    }
                }
                if (!hasCloseFlights) {
                    System.out.println("Nu exista zboruri ulterioare cu aceeasi destinatie pentru zborul cu plecare spre " + currentFlight.getDestinationAirport());
                }
            }
        }
        if (smallPrice == null) {
            System.out.println("Nu exista alte zboruri la preturi mai mici");
        } else {
            System.out.println(smallPrice);
        }
    }
}

