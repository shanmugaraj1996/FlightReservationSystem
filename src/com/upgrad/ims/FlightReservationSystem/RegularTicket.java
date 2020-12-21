package com.upgrad.ims.FlightReservationSystem;

public class RegularTicket extends Ticket {
    String specialServices;

    public RegularTicket(Flight flight) {
        super(flight);
    }

    public void updateSpecialServices(String specialServices){

        this.specialServices=specialServices;
    }
}
