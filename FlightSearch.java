/**
 * Utilizes a specified sorting strategy to search and sort flights.
 **/
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

