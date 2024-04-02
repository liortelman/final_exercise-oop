import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBy {

    //Sorts flights by price.
    public static class SortByPrice implements FlightSortStrategy {
        @Override
        public void sort(List<Flight> flights) {
            Collections.sort(flights, Comparator.comparingDouble(Flight::getPrice));
        }
    }

    //Sorts flights by departure time.
    public static class SortByDepartureTime implements FlightSortStrategy {
        @Override
        public void sort(List<Flight> flights) {
            Collections.sort(flights, Comparator.comparing(Flight::getDepartureTime));
        }
    }

    //Sorts flights by flight time.
    public static class SortByFlightTime implements FlightSortStrategy {
        @Override
        public void sort(List<Flight> flights) {
            Collections.sort(flights, Comparator.comparing(Flight::getFlightLen));
        }
    }

}
