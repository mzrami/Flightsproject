package com.example.FlightsProject.controller;

import com.example.FlightsProject.model.Airport;
import com.example.FlightsProject.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
@Controller
public class AirportController {

    @Autowired
    AirportRepository airportRepository;
    public static List<Airport> airportList = Arrays.asList();

    @Bean
    public ApplicationRunner preloadData() {

        return args -> {
            airportRepository.save(new Airport("TLV", "Ben Gurion", "ISRAEL"));
            airportRepository.save(new Airport("MXP","Milan Malpensa","ITALY"));
         //   airportRepository.save(new Airport("DXB", "Dubai", "U.A.E"));
            airportRepository.save(new Airport("LAX", "Los Angeles", "U.S.A"));
            airportRepository.save(new Airport("IST", "Istanbul", "TURKEY"));
         //   airportRepository.save(new Airport("LHR", "Heathrow", "U.K"));

        };
    }


}
