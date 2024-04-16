import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlightSearch {
    private FlightSortStrategy sortStrategy;

    public void setSortStrategy(FlightSortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }


    // Perform additional operations on the matching flights, if needed
    // For example, printing the matching flights
    public void search(List<Flight> flights) {
        if (sortStrategy != null) {
            sortStrategy.sort(flights);
        }
    }
}

//    public List<Flight> searchByPrice(List<Flight> flights, double max_price){
//        // Sort the flights by price
//        Collections.sort(flights, new SortByPrice());
//
//        // Initialize a new list to store filtered flights
//        List<Flight> new_list = new ArrayList<>();
//
//        // Iterate over the sorted list and add flights with prices less than or equal to max_price
//        for (Flight flight : flights) {
//            if (flight.getPrice() <= max_price) {
//                new_list.add(flight);
//            }
//        }
//
//        return new_list;
//    }
//
//    public List<Flight> searchByDepartureTime(List<Flight> flights){
//        // Sort the flights by time
//        Collections.sort(flights, new SortByDepartureTime());
//
//        return flights;
//    }
//
//    public List<Flight> searchByFlightTime(List<Flight> flights){
//        // Sort the flights by lengths
//        Collections.sort(flights, new SortByFlightTime());
//
//        return flights;
//    }
//}

//
//class SortByPrice implements Comparator<Flight> {
//
//    public int compare(Flight a, Flight b) {
//        double priceA = a.getPrice();
//        double priceB = b.getPrice();
//
//        return Double.compare(priceA, priceB);
//
//    }
//
//
//class SortByDepartureTime implements Comparator<Flight> {
//    public int compare(Flight a, Flight b) {
//        Time timeA = a.getDepartureTime();
//        Time timeB = b.getDepartureTime();
//
//        // Compare departure times
//        return timeA.compareTo(timeB);
//    }
//}
//
//class SortByFlightTime implements Comparator<Flight>{
//    public int compare(Flight a, Flight b){
//        Time timeA = a.getFlightLen();
//        Time timeB = b.getFlightLen();
//
//        // Compare flight times
//        return timeA.compareTo(timeB);
//    }
//}

//public class FlightSearchStrategy{

//    public List<Flight> searchFlight(List<Flight> flights, boolean byPrice, boolean byDTime, boolean byFTime){
//        List<Flight> temp = new ArrayList<Flight>();
//        if (byDTime){
//            temp =;
//        }
//    }
//}

//         // Initialize a new list to store filtered flights
//        List<Flight> new_list = new ArrayList<>();
//
//        // Add sorted flights to the new list
//        for (Flight flight : flights) {
//            new_list.add(flight);
//        }

//        // Compare length of flight time
//        if (timeA.before(timeB)) {
//            return -1;
//        } else if (timeA.after(timeB)) {
//            return 1;
//        } else {
//            // If length of flight times are equal
//            return 0;
//        }

//        // Compare departure times
//        if (timeA.before(timeB)) {
//            return -1;
//        } else if (timeA.after(timeB)) {
//            return 1;
//        } else {
//                // If departure times are equal
//                    return 0;
//        }

//        if (priceA < priceB) {
//            return -1;
//        } else if (priceA > priceB) {
//            return 1;
//        } else {
//            return 0;
//        }