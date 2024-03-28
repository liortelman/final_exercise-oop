import java.util.Observer;
public interface FlightObserver extends Observer {

    // Function to update on flight changes
    public void update(Flight flight);

}
