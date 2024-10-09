package com.jimena.shoppingcard.modelos;

public class Card {
    private int cardNumber;
    private double limit;
    private double balance;

    public Card(double limit) {
        this.limit = limit;
        this.cardNumber = cardNumber;
        this.balance = balance;

    }


    // Getters and Setters

    public int getCardNumber() {return cardNumber;}
    public void setCardNumber(int cardNumber) {this.cardNumber = cardNumber;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    //Function to make purchases
    public boolean makePurchase(double amount) {
        if (amount > balance) {
            System.out.println("The purchase cannot be made, insufficient balance.");
            return false;
        }
        balance -= amount;  // Descontar el monto de la compra
        System.out.println("Purchase made");
        return true;
    }

}
