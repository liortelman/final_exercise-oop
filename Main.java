import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("");

        AirlineCompany wizzAir = new LargeCompany("wizzAir");
        AirlineCompany El_Al = new LargeCompany("El_Al");
        AirlineCompany arkia = new SmallCompany("arkia");


        Flight flight1 = new Flight(234, new Time(3,14,0), new Time(15,2,9), 222.0, wizzAir);
        Flight flight2 = new Flight(49, new Time(7,4,0), new Time(0,49,0), 500, arkia);
        Flight flight3 = new Flight(5555, new Time(9,2,11), new Time(3,5,51), 1303, El_Al);

        List<Flight> check = new ArrayList<>();
        check.add(flight1);
        check.add(flight2);
        check.add(flight3);

        // Sort flights by price
        SortBy.SortByPrice sortByPrice = new SortBy.SortByPrice();
        sortByPrice.sort(check);
        SortBy.SortByFlightTime sortbyFtime = new SortBy.SortByFlightTime();
        sortbyFtime.sort(check);

        // Now the 'check' list is sorted by price

        // Print sorted flights
        for (Flight flight : check) {
            System.out.println("Flight ID: " + flight.getId() + ", Price: " + flight.getPrice() + ", Airline:" + flight.company.getName());
        }


        // Create a sample AirlineCompany object
        AirlineCompany airlineCompany = new SmallCompany("Sample Airline");

        // Create a sample Flight object
        Flight flight = new Flight(123, new Time(10, 0, 0), new Time(2, 30, 0), 500.0, airlineCompany);

        // Display initial flight details
        System.out.println("Initial Flight Details:");
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
    }

}
