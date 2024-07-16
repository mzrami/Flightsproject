package com.example.FlightsProject.controller;

import com.example.FlightsProject.model.Flight;
import com.example.FlightsProject.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/flight")
public class FlightController {
    @Autowired
    FlightRepository flightrepo;

    @GetMapping
    public String showFlights() {

        return "flightlist";
    }


    @ModelAttribute("flights")
    public Iterable<Flight> getallflights(){
        return flightrepo.findAll();
    }





}

//Check if the entity exists by name or some other value. A common approach might be something like the following:
//
////In your service
//public Object saveCountry(Country country){
//        Country existingCountry = countryRepository.findByName(country.getName()).orElse(null);
//        if(existingCountry == null){
//        //Country does not already exist so save the new Country
//        return countryRepository.save(country);
//        }
//        //The Country was found by name, so don't add a duplicate
//        else return "A Country with that name already exists";
//        }


//In your Country repository
//        Optional<Country> findByName(countryName);
