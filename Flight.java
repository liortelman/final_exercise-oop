import java.sql.Time;
import java.util.Observable;

public class Flight extends Observable {
    protected int id;
    Time departure_time;
    Time flight_len;
    protected double flight_price;
    AirlineCompany company;

    // Constructor for initializing a Flight object
    public Flight(int id, Time departure_time, Time flight_len, double flight_price, AirlineCompany company){
        this.id = id;
        this.departure_time = departure_time;
        this.flight_len = flight_len;
        this.flight_price = flight_price;
        this.company = company;
    }

    // Getter method for retrieving the flight ID
    public int getId() {
        return this.id;
    }

    // Getter method for retrieving the departure time of the flight
    public Time getDepartureTime(){
        return this.departure_time;
    }

    // Getter method for retrieving the price of the flight
    public double getPrice(){
        return this.flight_price;
    }

    // Method for retrieving the duration of the flight
    public Time getFlightLen(){
        return this.flight_len;
    }

    // Getter method for retrieving the Airline company of the flight
    public AirlineCompany getAirlineCompany(){
        return this.company;
    }

    // Method to change the departure time of the flight
    public void changeDepartureTime(Time newDepartureTime) {
        this.departure_time = newDepartureTime;
        FlightObserverManager observerManager = new FlightObserverManager();
        observerManager.notifyObservers(this, UpdateType.DEPARTURE_TIME_CHANGE);
        // Notify observers about the departure time change
    }
}
