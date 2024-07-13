package com.example.FlightsProject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
//@AllArgsConstructor
@NoArgsConstructor
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "AirportCode") })
public class Airport {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id ;


   // private String AirportCode ;


    private String AirportName ;

    private String CountryName ;

    public Airport( String id, String airportName , String countryName) {

        //this.AirportCode = airportCode;
        this.id = id ;
        this.AirportName = airportName;
        this.CountryName = countryName;
    }
}













