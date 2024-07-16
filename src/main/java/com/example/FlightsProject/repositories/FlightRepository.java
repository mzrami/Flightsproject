package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Airline_Company;
import com.example.FlightsProject.model.Flight;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightRepository extends CrudRepository<Flight,String> {
  //  List<Flight>
}
