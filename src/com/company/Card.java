
package com.company;
public class Card implements java.io.Serializable {
    String cardNum;
    String expDate;
    String pin;
    String cardHolder;
    public Card(String cardNum, String expDate, String pin, String cardHolder) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.pin = pin;
        this.cardHolder = cardHolder;
    }
}