package com.example.main;

import com.example.config.ProjectConfig;
import com.example.model.Song;
import com.example.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Example16 {

    public static void main(String[] args) {

        //Line responsible for initializing Spring IOC container
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicleService = context.getBean(VehicleService.class);
        System.out.println(vehicleService.getClass());
        Song song = new Song();
        song.setTitle("Blank Space");
        song.setSingerName("Taylor Swift");
        boolean vehicleStarted = true;
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted,song);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStarted);
    }
}
