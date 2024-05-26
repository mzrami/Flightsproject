package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @ManyToOne
    private Airports origin_airport_id ;

    @ManyToOne
    private Airports destination_airport_id ;

    @ManyToOne
    private Airline_Companies airline_company_id ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate departure_time ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate landing_time ;

    private int remaining_tickets ;

    @OneToMany
    @JoinColumn(name= "Flight_id" , unique = true)
    List<Tickets> ticketsList = new ArrayList<>();

}
