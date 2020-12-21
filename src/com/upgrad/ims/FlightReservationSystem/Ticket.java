package com.upgrad.ims.FlightReservationSystem;

public class Ticket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String ArrivalDateTime;
    String seatNumber;
    float price;
    boolean canceled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNumber, float price, boolean canceled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        ArrivalDateTime = arrivalDateTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.canceled = canceled;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Ticket(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void cancel(boolean canceled){
        this.canceled=canceled;
    }
    public boolean status(){
        return canceled;
    }
}
