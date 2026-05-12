package com.pluralsight;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

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

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
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

    @Override
    public String toString() {
        return name + '|' + address + '|' + phone;
    }

    // v -> says get the object v from method for comparison
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        return filterVehicle(v -> v.getPrice() >= min && v.getPrice() <= max);
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return filterVehicle(v -> v.getMake().equalsIgnoreCase(make) && v.getModel().equalsIgnoreCase(model));
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        return filterVehicle(v -> v.getYear() >= min && v.getYear() <= max);
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        return filterVehicle(v -> v.getColor().equalsIgnoreCase(color));
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        return filterVehicle(v -> v.getOdometer() >= min && v.getOdometer() <= max);
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        return filterVehicle(v -> v.getVehicleType().equalsIgnoreCase(vehicleType));
    }

    public ArrayList<Vehicle> getAllVehicles(){
            return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(int vin){
        inventory.removeIf(v -> v.getVin() == vin);
    }

    //cant take raw code used predicate to see if code is true or false/ cant use boolean because it will return only once and need to test each vehicle
    public ArrayList<Vehicle> filterVehicle(Predicate<Vehicle> condition){
        ArrayList<Vehicle> matching = new ArrayList<>();
        for(Vehicle v: inventory){
            if(condition.test(v)){
                matching.add(v);
            }
        }
        return matching;
    }
    }


