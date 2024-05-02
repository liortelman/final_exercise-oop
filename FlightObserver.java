/**
 * This interface defines a contract for objects that observe flight updates.
 **/
public interface FlightObserver {

    //This method is called when there is an update regarding a flight.
    void update(Flight flight, UpdateType updateType);
}
