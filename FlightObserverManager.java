import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class FlightObserverManager {
 private List<FlightObserver> observers;

 public FlightObserverManager() {
  this.observers = new ArrayList<>();
 }

 // this function introducing a new observer for updates on flights
 public void registerObserver(FlightObserver observer) {
  observers.add(observer);
 }

 //This function notifies all registered supervisors of flight changes.
 public void notifyObservers(Flight flight, UpdateType updateType) {
  for (FlightObserver observer : observers) {
   observer.update(flight, updateType);
   System.out.println("Flight update notified to observer");
  }
 }
}

//public FlightObserverManager() { this.observers = new ArrayList<>();}