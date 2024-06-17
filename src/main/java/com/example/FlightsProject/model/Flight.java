package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Flight {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id ;

    @ManyToOne
    private Airport origin_airport ;

    @ManyToOne
    private Airport destination_airport ;

    @ManyToOne
    private Airline_Company airline_company;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate departure_time ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate landing_time ;

    private int remaining_tickets ;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "Flight_id")
    List<Tickets> ticketsList = new ArrayList<>();

}
