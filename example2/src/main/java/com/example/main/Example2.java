package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {


        //Line responsible for initializing Spring IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Gives Spring Bean that is being maintained by the Spring IOC Container
        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

    }
}
