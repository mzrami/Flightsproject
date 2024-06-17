package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Long> {
}
