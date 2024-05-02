/**
 * Represents a large airline company that may own or manage smaller airline companies.
 */
import java.util.ArrayList;
import java.util.List;

public class LargeCompany extends AirlineCompany{

    List<SmallCompany> companies = new ArrayList<SmallCompany>();

    public LargeCompany(String company_name) {
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

    public void addCompany(SmallCompany company){
        companies.add(company);
    }
}
