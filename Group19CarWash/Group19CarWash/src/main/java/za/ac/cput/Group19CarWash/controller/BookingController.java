/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingController.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.services.BookingService;

import java.util.List;

@RestController
@RequestMapping
public class BookingController {

    @Autowired
    private final BookingService bookingService;

    public BookingController(BookingService bookingService){this.bookingService = bookingService;}

    @GetMapping(value = "/all")
    public ResponseEntity<List<Bookings>> getAllBookings(){
        List<Bookings> bookings = BookingService.findAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
    @GetMapping(value = "/find/{id}")
    public ResponseEntity<Bookings> getBookingById(@PathVariable("id") Long id) {
        Bookings bookings = bookingService.findBookingById(id);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
    @PostMapping(value = "/add")
    public ResponseEntity<Bookings>addBooking(@RequestBody Bookings bookings){
        Bookings newBooking = bookingService.addBooking(bookings);
        return new ResponseEntity<>(bookings, HttpStatus.CREATED);
    }
    @PutMapping(value = "/update")
    public ResponseEntity<Bookings>updateBookings(@RequestBody Bookings bookings){
        Bookings updateBookings = bookingService.updateBookings(bookings);
        return new ResponseEntity<>(updateBookings, HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?>deleteBooking(@PathVariable("id") Long id){
        bookingService.deleteBookingById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
