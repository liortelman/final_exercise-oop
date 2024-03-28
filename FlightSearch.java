import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlightSearch {

    public List<Flight> searchByPrice(List<Flight> flights, double max_price){
        // Sort the flights by price
        Collections.sort(flights, new SortByPrice());

        // Initialize a new list to store filtered flights
        List<Flight> new_list = new ArrayList<>();

        // Iterate over the sorted list and add flights with prices less than or equal to max_price
        for (Flight flight : flights) {
            if (flight.getPrice() <= max_price) {
                new_list.add(flight);
            }
        }

        return new_list;
    }

    public List<Flight> searchByDepartureTime(List<Flight> flights){
        return null;
    }
}

class SortByPrice implements Comparator<Flight> {

    public int compare(Flight a, Flight b) {
        double priceA = a.getPrice();
        double priceB = b.getPrice();

        if (priceA < priceB) {
            return -1;
        } else if (priceA > priceB) {
            return 1;
        } else {
            return 0;
        }
    }
}