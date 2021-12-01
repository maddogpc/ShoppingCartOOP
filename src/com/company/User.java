package com.company;

public abstract class User {
    private static User instance;
    String firstName, lastName, email;
    boolean isSeller;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSeller() { return isSeller; }

    public static void setInstance(User usr) {
        if (instance == null) {
            instance = usr;
        }
    }

    public static User getInstance() {
        if (instance == null) {
            System.out.println("Failed to retrieve instance");
            //Direct to login or something
        }
        return instance;
    }

    User(String firstName, String lastName, String email, boolean isSeller)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isSeller = isSeller;
    }
}