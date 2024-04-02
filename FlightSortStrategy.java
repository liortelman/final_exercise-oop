// FlightSortStrategy.java
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public interface FlightSortStrategy {
    void sort(List<Flight> flights);
}

