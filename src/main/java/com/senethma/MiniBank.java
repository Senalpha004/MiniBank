package com.senethma;

import java.util.*;

public class MiniBank {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MiniBankManager manager = new MiniBankManager(input); //creating an object to access the manager class

        //variable to control the program execution which makes it easier to exit
        boolean running = true;

        System.out.println("Welcome to Mini Bank");

        while (running) {

            showMenu();

            try {
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        manager.deposit();
                        break;

                        case 2:
                            manager.withdraw();
                            break;

                            case 3:
                                manager.checkBalance();
                                break;

                                case 4:
                                    running = false;
                                    break;

                    default:
                        System.out.println("Please choose a correct option!");
                        break;
                }

            }catch (InputMismatchException e){
                System.out.println("Invalid Input. Please try again");
                input.next();
            }
        }

    }

    private static void showMenu(){
        System.out.println("\n\n-------- Menu Options --------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

}
