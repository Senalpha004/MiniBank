package com.senethma;

import java.util.*;

public class MiniBankManager {

    private final Scanner sc;
    static double balance = 0.0;

    public MiniBankManager(Scanner sc) {
        this.sc = sc;
    }

    //method to deposit money
    public void deposit(){
        double amount = handleInput("Enter amount to deposit: ");
        balance += amount;
        System.out.println("Deposited " + amount + " Successfully");
    }

    //method to withdraw money
    public void withdraw(){
        double amount = handleInput("Enter amount to withdraw: ");

        if (amount > balance){
            System.out.println("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " Successfully");
    }

    //method to check balance
    public void checkBalance(){
        if (balance <= 0){
            System.out.println("No Balance left!");
        }else {
            System.out.println("Balance is " + balance);
        }
    }

    //creating a custom method to handle errors when taking inputs for the choices
    private double handleInput(String message){
        while(true){
            System.out.println(message);

            if (!sc.hasNextDouble()){
                System.out.println("Invalid input! Enter only an amount");
                sc.next();
                continue;
            }

            double amount = sc.nextDouble();

            if (amount <= 0){
                System.out.println("Amount must be more than 0.0 ");
                continue;
            }
            return  amount;
        }
    }

}

