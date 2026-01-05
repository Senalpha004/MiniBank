package com.senethma;

import java.util.*;

public class MiniBankManager {

    Scanner sc = new Scanner(System.in);
    static double balance = 0.0;

    //method to deposit money
    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount <= 0){
            System.out.println("Invalid amount! Amount must be more than 0.0 ");
        }else {
            balance += amount;
            System.out.println("Deposited " + amount + " Successfully");
        }
    }

    //method to withdraw money
    public void withdraw(){

        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (balance < amount){
            System.out.println("Insufficient Balance!");
        }else if (amount <= 0){
            System.out.println("Insufficient Balance!");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn " + amount + " Successfully");
        }

    }

    //method to check balance
    public void checkBalance(){
        if (balance <= 0){
            System.out.println("No Balance left!");
        }else {
            System.out.println("Balance is " + balance);
        }
    }

}

