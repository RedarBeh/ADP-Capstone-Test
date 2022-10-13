/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
IBookingsRepo.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.repository.bookings;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Bookings;

import java.util.List;
import java.util.Optional;

public interface IBookingsRepo extends JpaRepository<Bookings, Long> {
    void deleteBookingById(Long bookingId);
     //List<Bookings> findAllBookings(Long bookingId);
     Optional<Bookings> findBookingById(Long bookingId);
}

