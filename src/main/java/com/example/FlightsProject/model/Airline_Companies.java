package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Airline_Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id ;

    @Column(unique = true)
    private String Company_Name;

    @Column(unique = true)
    private String username;

    private String password;

    @OneToMany
    @JoinColumn (name= "Airline_Company_id")
    List<Flights> flightsList = new ArrayList<>();

    public String getUsername(String username) {
        return this.username = username;
    }

    public String getPassword(String password) {
        return this.password = password;
    }
}
