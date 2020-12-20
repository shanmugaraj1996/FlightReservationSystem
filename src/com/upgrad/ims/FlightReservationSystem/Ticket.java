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

    public void cancel(boolean canceled){
        this.canceled=canceled;
    }
    public boolean status(){
        return canceled;
    }
}
