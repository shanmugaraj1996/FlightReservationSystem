package com.upgrad.ims.FlightReservationSystem;

public class RegularTicket extends Ticket {
    String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureTime, String arrivalTime,
                         String seatNumber, float price, boolean canceled, Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureTime, arrivalTime, seatNumber, price, canceled, flight, passenger);
        this.specialServices=specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}
