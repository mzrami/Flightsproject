package com.example.FlightsProject.controller;

public class FlightController {
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
