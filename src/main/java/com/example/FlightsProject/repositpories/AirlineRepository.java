package com.example.FlightsProject.repositpories;

import com.example.FlightsProject.model.Airline_Companies;
import org.springframework.data.repository.CrudRepository;

public interface AirlineRepository extends CrudRepository<Airline_Companies,Long> {
}
