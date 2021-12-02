package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// Create
        // Replace with data from firebase
        Buyer x = new Buyer("Madison", "Verger", "madisonverger613@gmail.com", false);
        System.out.println(User.getInstance());
        x.card = new Card("num", "date", "pin", "holder");
        x.shippingDetails = new ShippingDetails("address", "city", "region", "country");
        //Upon exit routine for android, serialize all classes that need to be serialized:
        try {
            FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir")+"UserProfile");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(User.getInstance());
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + System.getProperty("user.dir")+"UserProfile");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
