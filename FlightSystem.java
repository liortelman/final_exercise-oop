import java.util.ArrayList;
import java.util.List;

public class FlightSystem {

    List<AirlineCompany> companies = new ArrayList<AirlineCompany>();

    // adding flights to an airline company
    public void addFlight(String Comp_name, Flight flight){
       // Find the AirlineCompany with the given name
        AirlineCompany targetCompany = null;
        for (AirlineCompany company : companies) {
            if (company.getName().equals(Comp_name)) {
                targetCompany = company;
                break;
            }
        }

        // If the company is found, add the flight to it
        if (targetCompany != null) {
            targetCompany.addFlight(flight);
        } else {
            System.out.println("Airline company with name " + Comp_name + " not found.");
        }
    }

    // cancel flight from an airline company
    public void cancelFlight(String Comp_name, Flight flight){
        // Find the AirlineCompany with the given name
        AirlineCompany targetCompany = null;
        for (AirlineCompany company : companies) {
            if (company.getName().equals(Comp_name)) {
                targetCompany = company;
                break;
            }
        }

        // If the company is found, remove the flight and notify observers
        if (targetCompany != null) {
            // Remove the flight from the company
            targetCompany.removeFlight(flight);

            // Create an instance of FlightObserverManager
            FlightObserverManager observerManager = new FlightObserverManager();

            // Notify observers about the flight cancellation using the instance
            observerManager.notifyObservers(flight, UpdateType.CANCELLATION);
        } else {
            System.out.println("Airline company with name " + Comp_name + " not found.");
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

//       for (int i = 0; i<companies.size(); i++){
//int temp_id = companies.get(i);
//            if (Comp_id == temp_id){
//        companies.get(i).addFlight(flight);
//                break;
//                        }
//                        }