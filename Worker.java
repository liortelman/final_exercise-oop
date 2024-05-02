/**
 * Represents a worker who can observe and receive updates about flights.
 */
import java.util.Observable;

public class Worker extends Person implements FlightObserver {
    public Worker(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void update(Flight flight, UpdateType updateType) {
        switch (updateType) {
            case DEPARTURE_TIME_CHANGE:
                System.out.println("Dear Worker " + getName() + ", the departure time of flight " + flight.getId() + " has been changed to " + flight.getDepartureTime());
                break;
            case CANCELLATION:
                System.out.println("Hello " + getName() + ". To your attention, flight " + flight.getId() + " has been cancelled. Please contact the airline for further assistance.");
                break;
            case PROMOTION:
                System.out.println("Hello Worker " + getName() + ", new promotions are available for flight " + flight.getId() + ". Don't miss out on the deals!");
                break;
            default:
                System.out.println("Dear Worker " + getName()+ ", there is a new update on flight " + flight+ " for you");
                break;
        }
    }
}
