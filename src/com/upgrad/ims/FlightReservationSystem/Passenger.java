package com.upgrad.ims.FlightReservationSystem;

public class Passenger {
    int id;
    private static int idCounter;
    Contact passengerContact;
    Address passengerAddress;

    public Passenger(int id, String name,String phone,String email,String street,String city,String state) {
        idCounter++;
        this.id = idCounter;
        this.passengerContact = new Contact(name,phone,email);
        this.passengerAddress = new Address(street,city,state);
    }

    int getPassengerCount(){
        return idCounter;
    }

    private static class Contact{
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public void updateContactDetails(String name, String phone, String email){
            this.name= name;
            this.phone=phone;
            this.email=email;
        }
    }
    private static class Address{ public String street;
        public String city;
        public String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public void updateAddressDetails(String street, String city, String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }

    }
}
