package com.jimena.shoppingcard.main;

import com.jimena.shoppingcard.modelos.Card;
import com.jimena.shoppingcard.modelos.Purchase;

import java.util.*;

public class Main {
    private static List<Card> shoppinglist= new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Welcome to the Shopping App =====");
        String name = "Jimena Chico";
        System.out.println(name);

        //Menu options
        int option;
        do {
            System.out.println("====Please select an option:=====");
            System.out.println("1. Make a purchase");
            System.out.println("2. Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Clean

            if (option != 2) {
                    System.out.println("Register the card limit");
                    double balance = scanner.nextDouble();
                    System.out.println("Enter the description of the purchase");
                    String description = scanner.next();
                    System.out.println("Enter the purchase value");
                    double amount = scanner.nextDouble();
                    Purchase purchase = new Purchase(balance,description,amount);

                    if(balance >= amount) {
                        System.out.println("¡PURCHASE MADE!");
                        balance += - amount;
                    }else
                        System.out.println("¡INSUFFICIENT BALANCE!");
                    break;


            }

        } while (option == 2);

        Map<String, Integer> purchases= new HashMap<>();
        List<Map.Entry<String, Integer>> shoppingList = new ArrayList<>(purchases.entrySet());
        shoppingList.sort(Map.Entry.comparingByValue());
        shoppingList.forEach(System.out::println);
        System.out.println("=============================");
        System.out.println("¡PURCHASE MADE!: " + "\n");
        System.out.println(shoppingList + "\n");
        System.out.println("==============================" + "\n");
       // System.out.println("Card balance: " + card.getBalance;
        System.out.println("¡Thank you for using the application!");

        scanner.close();


    }
}
