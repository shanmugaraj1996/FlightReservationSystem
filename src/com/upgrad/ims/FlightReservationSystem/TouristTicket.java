package com.upgrad.ims.FlightReservationSystem;

public abstract class TouristTicket extends Ticket {
    String hotelAddress;

    public TouristTicket(Flight flight) {
        super(flight);
    }

    public String getHotelAddress(){
          return this.hotelAddress;

    }
    
}
