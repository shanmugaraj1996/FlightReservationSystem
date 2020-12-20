package com.upgrad.ims.FlightReservationSystem;

public class Contact {
    String name;
    String phone;
    String email;

    public void updateContactDetails(String name,String phone,String email){
       this.name= name;
       this.phone=phone;
       this.email=email;
    }
}
