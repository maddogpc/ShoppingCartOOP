package com.company;

public class ShippingDetails implements java.io.Serializable {
    String address;
    String city;
    String region;
    String country;
    public ShippingDetails(String address, String city, String region, String country) {
        this.address = address;
        this.city = city;
        this.region = region;
        this.country = country;
    }
}