    public interface FlightObserver {

        void update(Flight flight, UpdateType updateType);
//
//        // Receives general updates
//        void update(Flight flight, String update);
//
//        // Receives updates on departure time changes.
//        void updateDepartureTime(Flight flight);
//
//        //Receives updates on flight cancellations.
//        void updateCancellation(Flight flight);
//
//        // Receives updates on new promotions.
//        void updatePromotion(Flight flight);
    }
