package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    DealershipFileManager file = new DealershipFileManager();
    Dealership dealership = file.getDealership();

    //user menu what they see
    //welcome

    //search menu
    public void display(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Select an Option Below:");
        System.out.println("1 - Find vehicles within a price range");
        System.out.println("2 - Find vehicles by make / model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
        int input = scanner.nextInt();

        switch(input){
            case 1 -> {
                String[] info = askInfo("min and max price", scanner);
                dealership.getVehiclesByPrice(Double.parseDouble(info[0]), Double.parseDouble(info[1]));
            }
            case 2 -> {
                String[] info = askInfo("make and model", scanner);
                dealership.getVehiclesByMakeModel(info[0], info[1]);
            }
            case 3 -> {
                System.out.println("Please enter the make:");
                String make = scanner.nextLine();

                System.out.println("Please enter the model:");
                String model = scanner.nextLine();

                dealership.getVehiclesByMakeModel(make, model);
            }
            case 4 -> {
                String[] info = askInfo("color", scanner);
                dealership.getVehiclesByColor(info[0]);
            }
            case 5 -> {
                String[] info = askInfo("min and max mileage", scanner);
                dealership.getVehiclesByMileage(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
            }
            case 6 -> {
                String[] info = askInfo("vehicle type", scanner);
                dealership.getVehiclesByType(info[0]);
            }
            case 7 -> dealership.getAllVehicles();
            case 8 -> dealership.addVehicle();
            case 9 -> dealership.removeVehicle();
            case 99 -> System.out.println("Thank you! Have a nice day.");
            default -> System.out.println("invalid input");
        }
    }

    public String[] askInfo(String string, Scanner scanner){
        while(true) {
            System.out.println("Please enter the " + string + ": ");
            String[] parts = scanner.nextLine().trim().split(" ");

            switch (parts.length){
                case 1 -> {
                    return new String[]{parts[0], ""};
                }
                case 2 -> {
                    return parts;
                }
                default -> System.out.println("Sorry entry not valid");
            }
        }
    }
    //price
    //make model
    //year
    //color
    //milage
    //type
    //all
    //add vehicle
    //remove vehicle
    //quit
}
