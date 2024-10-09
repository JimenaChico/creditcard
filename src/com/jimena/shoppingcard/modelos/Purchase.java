package com.jimena.shoppingcard.modelos;

public class Purchase extends Card{
    private String descrition;
    private double amount;

    public Purchase(double balance, String descrition, double amount) {
        super(balance);
        this.descrition = descrition;
        this.amount = amount;

    }
    //Getters and setters
    public String getDescrition() {return descrition;}
    public void setDescrition(String descrition) {this.descrition = descrition;}
    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    @Override
    public String toString() {
        return "Purchase: " + getDescrition() + " Amount:" + getAmount();
    }
}
