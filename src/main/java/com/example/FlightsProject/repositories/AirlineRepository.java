package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.Airline_Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AirlineRepository extends CrudRepository<Airline_Company, Long> {
    List<Airline_Company> findByCompanyName(String name);


}
