import java.util.ArrayList;
import java.util.List;

public class FlightSystem {

    List<AirlineCompany> companies = new ArrayList<AirlineCompany>();

    public void addFlight(int Comp_id, Flight flight){
        for (int i = 0; i<companies.size(); i++){
            int temp_id = companies.get(i).Company_id;
            if (Comp_id == temp_id){
                companies.get(i).addFlight(flight);
                break;
            }
        }
    }
    // this function return list of booked flights
   public List<Flight> getFlights(){
       List<Flight> allFlights = new ArrayList<>();
       for (AirlineCompany company : companies) {
           allFlights.addAll(company.getFlights());
       }
       return allFlights;
   }
}
