import java.util.Observable;

public class Passenger extends Person implements FlightObserver {
    public Passenger(String name, int age) {
        super(name, age);
    }

    public void update(Flight flight, UpdateType updateType) {
        switch (updateType) {
            case DEPARTURE_TIME_CHANGE:
                System.out.println("Dear Passenger " + getName() + ", the departure time of your flight has been changed to " + flight.getDepartureTime() + ". Please check your itinerary for details.");
                break;
            case CANCELLATION:
                System.out.println("Attention Passenger " + getName() + ", we regret to inform you that your flight has been cancelled. Please contact the airline for rebooking options.");
                break;
            case PROMOTION:
                System.out.println("Hello Passenger " + getName() + ", enjoy exclusive promotions for your flight. Check your email or visit our website for more information.");
                break;
        }
    }
}
//
//    @Override
//    public void update(Flight flight, String update) {
//        System.out.println("Dear passenger " + getName() + ", A new update on flight " + flight+ " for you: " + update);
//
//    }
//
//    @Override
//    public void updateDepartureTime(Flight flight) {
//        System.out.println("Dear Passenger " + getName() + ", the departure time of your flight has been changed to " + flight.getDepartureTime() + ". Please check your itinerary for details.");
//    }
//
//    @Override
//    public void updateCancellation(Flight flight) {
//        System.out.println("Attention Passenger " + getName() + ", we regret to inform you that your flight has been cancelled. Please contact the airline for rebooking options.");
//    }
//
//    @Override
//    public void updatePromotion(Flight flight) {
//        System.out.println("Hello Passenger " + getName() + ", enjoy exclusive promotions for your flight. Check your email or visit our website for more information.");
//    }

