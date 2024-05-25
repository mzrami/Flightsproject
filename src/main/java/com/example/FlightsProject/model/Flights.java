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
    private BigInteger id ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate Departure_Time ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDate Landing_Time ;

    private int Remaining_Tickets ;

    @OneToMany
    @JoinColumn(name= "Flight_id" , unique = true)
    List<Tickets> ticketsList = new ArrayList<>();

}
