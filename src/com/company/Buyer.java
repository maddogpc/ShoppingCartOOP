package com.company;

public class Buyer extends User implements java.io.Serializable {
    String firstName, lastName, email;
    boolean isSeller;
    Card card;
    ShippingDetails shippingDetails;
    //Card added upon addCard
    //ShippingDetails added upon addShippingDetails
    public Buyer(String firstName, String lastName, String email, boolean isSeller)
    {
        super(firstName, lastName, email, isSeller);
        User.setInstance(this);
    }
}
