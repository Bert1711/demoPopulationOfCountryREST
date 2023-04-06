package com.example.demopopulationofcountryrest.controller;

import com.example.demopopulationofcountryrest.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/russia")
    public ResponseEntity<Country> russia() {
        Country country = Country.of("Russia", 148);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Continent", "Europe and Asia")
                .header("Capital", "Moscow")
                .header("Favorite-food", "dumplings")
                .body(country);
    }
    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country country = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Continent", "Europe")
                .header("Capital", "Paris")
                .header("Favorite-food", "cheese and wine")
                .body(country);
    }

}
