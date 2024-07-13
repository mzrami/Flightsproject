package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Airline_Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String companyName;

    @ManyToOne
    private Airport airport;



    private String Username;

    private String Password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "airline_company_id")
    List<Flight> flightList = new ArrayList<>();



    public Airline_Company(String companyName,Airport airport, String username, String password) {

        this.airport = airport ;
        this.companyName = companyName;
        this.Username = username;
        this.Password = password;
    }

}