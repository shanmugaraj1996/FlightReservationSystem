package com.upgrad.ims.FlightReservationSystem;

public class Address {
    public String street;
    public String city;
    public String state;

    public void updateAddressDetails(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }
}
