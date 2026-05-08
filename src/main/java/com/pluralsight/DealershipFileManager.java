package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DealershipFileManager {
    private ArrayList<Vehicle> inventory = new ArrayList<>();
    private String fileName = "inventory.csv";

public Dealership getDealership() {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        Dealership dealership1 = null;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length == 3) {
                String name = parts[0];
                String address = parts[1];
                String phone = parts[2];
                dealership1 = new Dealership(name, address, phone);

            } else if (parts.length == 8) {
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                inventory.add(vehicle);

            } else {
                System.out.println("Invaild data");
            }
        }

        reader.close();
        dealership1.setInventory(inventory);
        return dealership1;

    } catch (Exception e) {
        System.out.println("failure");
        return null;
    }
}

//need tyo fix this
public void saveDealership(){
    try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(getDealership().getName() + ".csv", true));
        writer.write(String.valueOf(inventory));asdgasfgasgqewrghwerhwert

        writer.close();
    } catch (Exception e){
        System.out.println("Failed to make new dealership file");
    }

}
    //save all changes to file
}
