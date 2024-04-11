package com.example.beans;

import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name= "Audi 8";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){

        System.out.println("Vehicle bean created by Spring");
        this.vehicleService = vehicleService;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
