package com.company;

public class Payment implements java.io.Serializable {
    String accountNumber;
    String routingNumber;
    String accountType;
    public Payment(String accountNumber, String routingNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.accountType = accountType;
    }
}