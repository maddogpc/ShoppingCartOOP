package com.company;
import java.util.ArrayList;

public class Seller extends User implements java.io.Serializable {
    String firstName, lastName, email;
    boolean isSeller;
    Payment payment;
    //Payment added upon addPayment
    ArrayList<Order> orders;
    public Seller(String firstName, String lastName, String email, boolean isSeller)
    {
        super(firstName, lastName, email, isSeller);
        orders = OrderDB.getInstance().getOrdersBySeller(this);
        User.setInstance(this);
    }
}
