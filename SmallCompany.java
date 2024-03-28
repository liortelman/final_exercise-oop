import java.util.List;

public class SmallCompany extends AirlineCompany{

    @Override
    public int getId() {
        return Company_id;
    }

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public List<Flight> getFlights() {
        return this.flights;
    }
}
