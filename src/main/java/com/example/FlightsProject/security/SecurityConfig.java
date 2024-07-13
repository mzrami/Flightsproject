package com.example.FlightsProject.security;

import com.example.FlightsProject.model.User;
import com.example.FlightsProject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf-> csrf.disable()).authorizeRequests(authorize -> authorize
                .requestMatchers("/design", "/**").hasAnyAuthority("USER","ADMIN","OIDC_USER","OAUTH2_USER")
                .requestMatchers("/adminpanel").hasRole("ADMIN")
                .requestMatchers("/", "/**").permitAll())
//                .oauth2Login(oauth-> oauth.loginPage("/login"))//default link provided by spring
                .formLogin(login -> login.loginPage("/login"))//allow default login page
                .logout(logout -> logout.logoutSuccessUrl("/"));
        return http.build();
    }


    @Autowired
    UserRepository userRepository ;



      @Bean
  public UserDetailsService GetUserDetailsServise(){
          return username -> {
              User user = userRepository.findByUsername(username);
              if (user != null) return user;
              throw new UsernameNotFoundException("User '" + username + "' not found");
          };


      }



}
