package com.company;

public class Seller extends User {
    private static Seller instance;
    String firstName, lastName, email;
    boolean isSeller;

    public Seller(String firstName, String lastName, String email, boolean isSeller)
    {
        super(firstName, lastName, email, isSeller);
        //Payment Details = new payment details etc from firebase
        User.setInstance(this);
    }
}
