package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id ;

    @ManyToOne
    private Airport origin_airport ;

    @ManyToOne
    private Airport destination_airport ;

    @ManyToOne
    private Airline_Company airline_company;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDateTime departure_date ;

    @DateTimeFormat ( pattern = "MM-dd-yyyy")
    private LocalDateTime landing_date ;


   private int remaining_tickets ;

   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn(name= "Flight_id")
   List<Tickets> ticketsList = new ArrayList<>();


    public Flight(String id, Airport origin_airport, Airport destination_airport, Airline_Company airline_company, LocalDateTime departure_date, LocalDateTime landing_date, int remaining_tickets) {
        this.id = id;
        this.origin_airport = origin_airport;
        this.destination_airport = destination_airport;
        this.airline_company = airline_company;
        this.departure_date = departure_date;
        this.landing_date = landing_date;
        this.remaining_tickets = remaining_tickets;
    }
}

