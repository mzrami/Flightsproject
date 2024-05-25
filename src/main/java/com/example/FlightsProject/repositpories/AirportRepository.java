package com.example.FlightsProject.repositpories;

import com.example.FlightsProject.model.Airports;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airports,Long> {
}
