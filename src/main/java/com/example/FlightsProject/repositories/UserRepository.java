package com.example.FlightsProject.repositories;

import com.example.FlightsProject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
