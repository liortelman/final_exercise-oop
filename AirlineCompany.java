import java.util.ArrayList;
import java.util.List;

public abstract class AirlineCompany {
    protected String Company_name;
    protected List<Flight> flights = new ArrayList<Flight>();

    // Constructor to set the company name
    public AirlineCompany(String company_name) {
        this.Company_name = company_name;
    }

    public abstract String getName();

    public abstract void addFlight(Flight flight);

    public abstract void removeFlight(Flight flight);

    public abstract List<Flight> getFlights();
}


