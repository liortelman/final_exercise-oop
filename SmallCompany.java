import java.util.List;

public class SmallCompany extends AirlineCompany{

    public SmallCompany(String company_name) {
        super(company_name);
    }

    @Override
    public String getName() {
        return Company_name;
    }

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void removeFlight(Flight flight) {
        flights.remove(flight);
    }

    @Override
    public List<Flight> getFlights() {
        return this.flights;
    }
}
