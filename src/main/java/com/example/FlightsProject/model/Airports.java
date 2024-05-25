package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Airports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(unique = true)
    private String Airport_Name ;

    @Column(unique = true)
    private String Country_Name ;

    @ManyToMany
    @JoinColumn (name= "Airport_id")
    List<Airline_Companies> airline_companiesList = new ArrayList<>();

    @ManyToMany
    @JoinColumn (name= "Origin_Airport_id")
    @JoinColumn (name= "Destination_Airport_id")
    List<Flights> flightsList = new ArrayList<>();










}
