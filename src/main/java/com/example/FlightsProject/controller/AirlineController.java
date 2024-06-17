package com.example.FlightsProject.controller;

import com.example.FlightsProject.model.Airline_Company;
import com.example.FlightsProject.repositories.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class AirlineController {

    @Autowired
    AirlineRepository airlineRepository;

    public static List<Airline_Company> airlineCompanyList = Arrays.asList();

    @Bean
    public ApplicationRunner preloadData() {

        return args -> {
            airlineRepository.save(new Airline_Company("EL-AL","ELALADMIN","ADMIN"));
           // airlineRepository.save(new Airline_Company("ALT","ALITALIA","MXP","ALTADMIN","ADMIN"));
         //   airlineRepository.save(new Airline_Company("LAX", "Los Angeles", "U.S.A"));
          //  airlineRepository.save(new Airline_Company("TRA", "Turkish Airline","IST", "TURKEY"));


        };
    }


}
