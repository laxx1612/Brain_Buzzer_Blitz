package com.capgemini.brain.buzzer.blitz.leaderboard.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.capgemini.brain.buzzer.blitz.leaderboard.model.User;
import com.capgemini.brain.buzzer.blitz.leaderboard.repository.UserRepository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:8080", "http://localhost:8081" })
@RestController
@RequestMapping("/ranks")
public class UserController {

    @Autowired
    private UserRepository userRepo;


    @GetMapping("")
    public ResponseEntity<List<User>> getLEaderBoard() {
        List<User> userList = userRepo.findAllOrderByRatingsDesc();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }


    @GetMapping("{username}")
    public ResponseEntity<Integer> getUserByUserName(@PathVariable String username) {
        Optional<User> userOptional = userRepo.findByUsername(username);
        
        if (userOptional.isPresent()) {
            int rank = userRepo.getRankByUsername(username);
            return new ResponseEntity<>(rank, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
