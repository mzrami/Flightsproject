package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight,Long> {
}
