package com.example.FlightsProject.repositpories;

import com.example.FlightsProject.model.Flights;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flights,Long> {
}
