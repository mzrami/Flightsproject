package com.example.FlightsProject.controller;

import com.example.FlightsProject.model.User;
import com.example.FlightsProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Configuration
@RequestMapping("/register")
public class UserController {
@Autowired
private UserRepository userRepository ;

@Autowired
private PasswordEncoder passwordEncoder ;

        @GetMapping
        public String registerForm() {
            return "register"; // return the  register html page
        }

        @PostMapping
        public String processRegistration(User user) {

            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return "redirect:/login";

        }


}


