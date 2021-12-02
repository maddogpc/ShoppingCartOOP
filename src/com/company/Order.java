package com.company;

import java.util.ArrayList;

public class Order implements java.io.Serializable {
    String buyerEmail;
    String sellerEmail;
    String email;
    Card cardInfo;
    ShippingDetails shippingDetails;
    ArrayList<Product> products = null;
    double totalCost;

    public double getTotalCostCost() {
        totalCost = 0;
        double costDifferential = 0;
        for (Product prod : products) {
            costDifferential += prod.getCost();
        }
        totalCost += costDifferential;
        return totalCost;
    }

    public Order(String buyerEmail, String sellerEmail, String email, Card cardInfo, ShippingDetails shippingDetails) {
        this.buyerEmail = buyerEmail;
        this.sellerEmail = sellerEmail;
        this.email = email;
        this.cardInfo = cardInfo;
        this.shippingDetails = shippingDetails;
        products = new ArrayList<Product>();
        totalCost = 0;
    }
}