package com.upgrad.ims.FlightReservationSystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address=new Address();
        address.street="Gandhi Street";
        address.city="Bangalore";
        address.state="Karnataka";

        Contact contact=new Contact();
        contact.name="Shanmugaraj";
        contact.email="shan@gmail.com";
        contact.phone="9123456789";
        System.out.print(contact.name);
    }
}
