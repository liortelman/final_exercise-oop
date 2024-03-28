import java.util.ArrayList;
import java.util.List;

public abstract class AirlineCompany {
    protected int Company_id;
    protected List<Flight> flights = new ArrayList<Flight>();

    public abstract int getId();

    public abstract void addFlight(Flight flight);

    public abstract List<Flight> getFlights();
}


