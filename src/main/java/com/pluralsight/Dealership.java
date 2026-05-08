package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vechicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Vechicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vechicle> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Search Methods

    public ArrayList<Vechicle> getVehiclesByPrice(int min, int max) {
        return null;
    }

    public ArrayList<Vechicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public ArrayList<Vechicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    public ArrayList<Vechicle> getVehiclesByColor(String color) {
        return null;
    }

    public ArrayList<Vechicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public ArrayList<Vechicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public ArrayList<Vechicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vechicle vehicle){

    }

    public void removeVehicle(Vechicle vehicle){

    }
}
