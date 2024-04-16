import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("");

        AirlineCompany wizzAir = new LargeCompany("wizzAir");
        AirlineCompany El_Al = new LargeCompany("El_Al");
        AirlineCompany arkia = new SmallCompany("arkia");

        Flight flight1 = new Flight(234, new Time(3, 14, 0), new Time(15, 2, 9), 222.0, wizzAir, "France");
        Flight flight2 = new Flight(49, new Time(7, 4, 0), new Time(0, 49, 0), 500, arkia, "Spain");
        Flight flight3 = new Flight(5555, new Time(9, 2, 11), new Time(3, 5, 51), 1303, El_Al, "Italy");

        List<Flight> check = new ArrayList<>();
        check.add(flight1);
        check.add(flight2);
        check.add(flight3);

        // Sort flights by price
        SortBy.SortByPrice sortByPrice = new SortBy.SortByPrice();
        sortByPrice.sort(check);

        // Print sorted flights with flight time
        System.out.println("Flights sorted by price:");
        printFlights(check);

        // Sort flights by flight time
        SortBy.SortByFlightTime sortByFlightTime = new SortBy.SortByFlightTime();
        sortByFlightTime.sort(check);

        // Print sorted flights with flight time
        System.out.println("\nFlights sorted by flight time:");
        printFlights(check);

        // Sort flights by destination
        SortBy.SortByDestination sortByDestination = new SortBy.SortByDestination();
        sortByDestination.sort(check);

        // Print sorted flights with flight time
        System.out.println("\nFlights sorted by destination:");
        printFlights(check);

        // Create a sample AirlineCompany object
        AirlineCompany airlineCompany = new SmallCompany("Sample Airline");

        // Create a sample Flight object
        Flight flight = new Flight(123, new Time(10, 0, 0), new Time(2, 30, 0), 500.0, airlineCompany, "Germany");

        // Display initial flight details
        System.out.println("\nInitial Flight Details:");
        displayFlightDetails(flight);

        // Change the departure time of the flight
        flight.changeDepartureTime(new Time(12, 0, 0));

        // Display updated flight details
        System.out.println("\nFlight Details After Departure Time Change:");
        displayFlightDetails(flight);
    }

    // Helper method to display flight details
    private static void displayFlightDetails(Flight flight) {
        System.out.println("Flight ID: " + flight.getId());
        System.out.println("Departure Time: " + flight.getDepartureTime());
        System.out.println("Flight Duration: " + flight.getFlightLen());
        System.out.println("Flight Price: " + flight.getPrice());
        System.out.println("Airline Company: " + flight.getAirlineCompany().getName());
        System.out.println("Destination: " + flight.getDestination());
    }

    // Helper method to print flights with flight time
    private static void printFlights(List<Flight> flights) {
        for (Flight flight : flights) {
            System.out.println("Flight ID: " + flight.getId() + ", Price: " + flight.getPrice() +
                    ", Airline: " + flight.getAirlineCompany().getName() +
                    ", Destination: " + flight.getDestination() +
                    ", Departure Time: " + flight.getDepartureTime() +
                    ", Flight Duration: " + flight.getFlightLen());
        }
    }
}
