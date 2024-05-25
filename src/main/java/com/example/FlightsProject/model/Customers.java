package com.example.FlightsProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id ;

    private String First_Name ;
    private String Last_Name ;
    private String Address ;

    @Column(unique = true)
    private String Phone_No ;

    @Column(unique = true)
    private String Credit_Card_No ;

    private String username;
    private String password;

    @OneToMany
    @JoinColumn(name= "Customer_id" , unique = true)
    List<Tickets> ticketsList = new ArrayList<>();

    public String getUsername(String username) {
        return this.username= username;
    }

    public String getPassword(String password) {
        return this.password = password;
    }




}
