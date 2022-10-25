package za.ac.cput.Group19CarWash.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Group19CarWash.domain.Bookings;

import static org.junit.jupiter.api.Assertions.*;

class BookingsFactoryTest {

    @Test
    void createBookings() {
        Bookings bookings = BookingsFactory.createBookings("521","23 April 2022", "18:00 PM","4200","10");
        assertNotNull(bookings);
        System.out.println(bookings);
    }
}