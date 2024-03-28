import java.util.ArrayList;
import java.util.List;

public class LargeCompany extends AirlineCompany{

    List<SmallCompany> companies = new ArrayList<SmallCompany>();

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

    public void addCompany(SmallCompany company){
        companies.add(company);
    }
}
