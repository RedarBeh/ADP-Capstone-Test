package za.ac.cput.Group19CarWash.repository.bookings.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.factory.BookingsFactory;
import org.junit.jupiter.api.MethodOrderer;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class BookingsRepoIMPLTest {

    private static BookingsRepoIMPL repository = BookingsRepoIMPL.getBookingList();
    private static Bookings bookings = BookingsFactory.createBookings("321","13 April 2022", "14:00 PM","4700","1");

    @Test
    void a_create() {
        Bookings created = repository.create(bookings);
        assertEquals(bookings.getBookingId(), created.getBookingId());
        System.out.println("Creating Booking Details Below:");
        System.out.println("Create: " + created);
        System.out.println("==================================");
    }

    @Test
    void b_read() {
        Bookings read = repository.read(bookings.getBookingId());
        Assertions.assertEquals(bookings.getBookingId(), read.getBookingId());
        // assertNotNull(read);
        System.out.println("Displaying Booking Details Below");
        System.out.println("Read: " + read);
        System.out.println("==================================");
    }

    @Test
    void c_update() {
        Bookings updated = new Bookings.Builder().copy(bookings).setDate("14 December 2022")
                .setTime("11:00 AM")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Display updated Booking Details of Date + Time");
        System.out.println("Updated: " + updated);
        System.out.println("==================================");
    }

    @Test
    void e_delete() {
        boolean working = repository.delete(bookings.getBookingId());
        assertFalse(working);
        System.out.println("Deleting the Booking Below:");
        System.out.println("Deleted: " + bookings);
        System.out.println("==================================");
    }

    @Test
    void d_findAll() {
        System.out.println("Display All Bookings: ");
        System.out.println(repository.findAll());
        System.out.println("===================================");
    }
}