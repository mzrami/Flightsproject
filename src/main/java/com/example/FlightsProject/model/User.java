package com.example.FlightsProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

@Entity
@Data
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "The username must not be empty")
    private  String username;
    @NotBlank(message = "The password must not be empty")
    private  String password;
    @NotBlank(message = "The fullName must not be empty")
    private  String fullName;
    @NotBlank(message = "The street must not be empty")
    private  String street;
    @NotBlank(message = "The city must not be empty")
    private  String city;
    @NotBlank(message = "The state must not be empty")
    private  String state;
    @NotBlank(message = "The zipcode must not be empty")
    private  String zip;
    @NotBlank(message = "The phoneNumber must not be empty")
    private  String phoneNumber;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(username.equals("admin")){
            return Arrays.asList(new SimpleGrantedAuthority("ADMIN"));

        }
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }//Automatically give role user (the simple role)
    @Override
    public boolean isAccountNonExpired() {
        return true;}//by default not expired
    @Override
    public boolean isAccountNonLocked() {
        return true;}//by default not blocked
    @Override
    public boolean isCredentialsNonExpired() {
        return true;}//by default not expired
    @Override
    public boolean isEnabled() {
        return true;}//by default enabled.

}