package com.upgrad.ims.FlightReservationSystem;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Ticket {
    String pnr;
    String from;
    String to;
    String departureTime;
    String arrivalTime;
    String seatNumber;
    float price;
    boolean canceled;
    private Flight flight;
    private Passenger passenger;

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        arrivalTime = arrivalTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }



    public Ticket(String pnr, String from, String to, String departureTime, String arrivalTime, String seatNumber,
                  float price, boolean canceled,Flight flight,Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.canceled = canceled;
        this.flight=flight;
        this.passenger=passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getFlightDuration(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime departureTime=LocalDateTime.parse(this.departureTime);
        LocalDateTime arrivalTime=LocalDateTime.parse(this.arrivalTime);
        int days=arrivalTime.getDayOfMonth()-departureTime.getDayOfMonth();
        int totalHours=(days*24)+(arrivalTime.getHour()-departureTime.getHour());
        return totalHours;
    }
}
