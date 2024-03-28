import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class FlightObserverManager {
   private List<Observer> observers;

 public FlightObserverManager() {
  this.observers = new ArrayList<>();
 }

   // this function introducing a new observer for updates on flights
    public void registerObserver(Observer observer){
     observers.add(observer);
    }

    //This function notifies all registered supervisors of flight changes.
    public void notifyObservers(Flight flight) {
     for (Observer observer : observers) {
      observer.update(flight,null);
     }
    }
}
