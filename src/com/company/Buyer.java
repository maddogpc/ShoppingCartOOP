package com.company;

public class Buyer extends User {
    private static Buyer instance;
    String firstName, lastName, email;
    boolean isSeller;
    Card card;
    ShippingDetails shippingDetails;
    public Buyer(String firstName, String lastName, String email, boolean isSeller)
    {
        super(firstName, lastName, email, isSeller);
        //Card = new card shipping details etc from firebase
        User.setInstance(this);
    }
}
