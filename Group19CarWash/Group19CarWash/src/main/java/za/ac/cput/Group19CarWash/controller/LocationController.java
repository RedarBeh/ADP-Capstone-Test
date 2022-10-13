/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
LocationController.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.services.LocationService;

import java.util.List;

@RestController
@RequestMapping
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService){this.locationService = locationService;}

    @GetMapping(value="/location")
    public String getPage(){return "Welcome to Group 19 CapStone Project 2022";}

    @GetMapping(value = "/allLocation")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> location = LocationService.findAllLocations();
        return new ResponseEntity<>(location, HttpStatus.OK);
    }
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Location> getId(@PathVariable("id") Long id) {
        Location location = locationService.findById(id);
        return new ResponseEntity<>(location, HttpStatus.OK);
    }
    @PostMapping(value = "/addLocation")
    public ResponseEntity<Location>addLocation(@RequestBody Location location){
        Location newLocation = locationService.addLocation(location);
        return new ResponseEntity<>(location, HttpStatus.CREATED);
    }
    @PutMapping(value = "/updateLocation")
    public ResponseEntity<Location>updateLocation(@RequestBody Location location){
        Location updateLocation = locationService.updateLocation(location);
        return new ResponseEntity<>(updateLocation, HttpStatus.OK);
    }
    @PutMapping(value = "/deleteby/{id}")
    public ResponseEntity<?>deleteLocation(@PathVariable("id") Long id){
        locationService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
