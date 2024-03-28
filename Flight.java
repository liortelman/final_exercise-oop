import java.sql.Time;
import java.util.Observable;
import java.util.Observer;
public class Flight extends Observable {
    int id;
    Time departure_time;
    Time flight_len;

    public Flight(int id, Time departure_time, Time flight_len ){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getDepartureTime(){
        return " ";
    }

    public double getPrice(){
        return 0.0;
    }

}
