/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingService.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.exception.BookingNotFoundException;
import za.ac.cput.Group19CarWash.repository.bookings.IBookingsRepo;

import java.util.List;
import java.util.UUID;

@Service
public class BookingService {
    private static IBookingsRepo iBookingsRepo;

    @Autowired
    public BookingService(IBookingsRepo iBookingsRepo){this.iBookingsRepo= iBookingsRepo;}

    public Bookings addBooking(Bookings bookings){
        bookings.setBookingId(UUID.randomUUID().toString());
        return iBookingsRepo.save(bookings);
    }
    public static List<Bookings>findAllBookings(){return iBookingsRepo.findAll();}
    public Bookings updateBookings(Bookings bookings){return iBookingsRepo.save(bookings);}

    public Bookings findBookingById(Long id){
        return iBookingsRepo.findBookingById(id).orElseThrow(() -> new BookingNotFoundException("Booking by Id"+ id + "was not found"));}

    public void deleteBookingById(Long id){iBookingsRepo.deleteBookingById(id);}
}
