package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example15 {

    public static void main(String[] args) {

        //Line responsible for initializing Spring IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleService",VehicleService.class);
        System.out.println("Hashcode of the object vehicleService1 : " +vehicleService1.hashCode());
        System.out.println("Hashcode of the object vehicleService2 : " +vehicleService2.hashCode());
        if(vehicleService1==vehicleService2){
            System.out.println("VehicleService bean is a singleton scoped bean");
        }
        else
            System.out.println("VehicleService bean is a prototype scoped bean");
    }
}
