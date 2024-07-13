package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Airline_Company;
import com.example.FlightsProject.model.Airport;
import com.example.FlightsProject.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Service
public class LoadDataInRunning {

    @Autowired
    AirlineRepository airlineRepository;


    @Autowired
    AirportRepository airportRepository;
    //   List<Airport> airportList = Arrays.asList();

    @Autowired
    FlightRepository flightrepo;

    @Bean
    public ApplicationRunner preloadData() {

        return args -> {
            Airport airport1 = airportRepository.save(new Airport("TLV", "Ben Gurion", "ISRAEL"));
            Airport airport2 = airportRepository.save(new Airport("MXP", "Milan Malpensa", "ITALY"));
            Airport airport3 = airportRepository.save(new Airport("IST", "Istanbul", "TURKEY"));
            Airport airport4 = airportRepository.save(new Airport("LHR", "Heathrow", "U.K"));

            Airline_Company ELAL;
            Airline_Company ALITALIA;
            Airline_Company Turkish ;
            Airline_Company British ;

            List<Airline_Company> airlineCompanyList = Arrays.asList(
                    ELAL     = new Airline_Company("EL-AL",airport1, "ELALADMIN", "ADMINel"),
                    ALITALIA = new Airline_Company("ALITALIA",airport2, "ALTADMIN", "ADMINalt"),
                    Turkish  = new Airline_Company("Turkish Airline",airport3, "TRADMIN", "ADMINtr"),
                    British  =  new Airline_Company("British Airways",airport4, "BRADMIN", "ADMINba")
            );

           // List<Flight> flightList = Arrays.asList(

                    flightrepo.save(new Flight("EJ473",airport1,airport3,ELAL,LocalDateTime.parse("07-20-2024T20:00:00"),LocalDateTime.parse("07-21-2024T20:00:00"),100));
                    flightrepo.save(new Flight("FG221",airport4,airport2,ALITALIA, LocalDateTime.parse("07-15-2024T15:30:00"),LocalDateTime.parse("07-15-2024T20:00:00"),120));
          //  );
            // save airline company
            for (Airline_Company airlineCompany : airlineCompanyList) {
                if (airlineRepository.findByCompanyName(airlineCompany.getCompanyName()).isEmpty()) {
                    airlineRepository.save(airlineCompany);


                }
            }


        };
    }


//    @Bean
//    public ApplicationRunner preloadData() {
//
//        return args -> {
//            airportRepository.save(new Airport("TLV", "Ben Gurion", "ISRAEL"));
//            airportRepository.save(new Airport("MXP","Milan Malpensa","ITALY"));
//            //   airportRepository.save(new Airport("DXB", "Dubai", "U.A.E"));
//            airportRepository.save(new Airport("LAX", "Los Angeles", "U.S.A"));
//            airportRepository.save(new Airport("IST", "Istanbul", "TURKEY"));
//            //   airportRepository.save(new Airport("LHR", "Heathrow", "U.K"));
//
//        };
//    }


}
