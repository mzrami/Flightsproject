package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Airline_Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;


    private String CompanyName;

    @ManyToOne
    private Airports airport ;


    private String Username;

    private String Password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name= "airline_company_id")
    List<Flight> flightList = new ArrayList<>();



    public String getUsername(String username) {
        return this.Username = username;
    }

    public String getPassword(String password) {
        return this.Password = password;
    }
}
