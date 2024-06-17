package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Airline_Company;
import org.springframework.data.repository.CrudRepository;

public interface AirlineRepository extends CrudRepository<Airline_Company, Long> {
}
