/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingsRepoIMPL.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.repository.bookings.impl;

import za.ac.cput.Group19CarWash.domain.Bookings;

import java.util.List;
import java.util.ArrayList;

import static org.springframework.http.RequestEntity.delete;

public class BookingsRepoIMPL {
    private final List<Bookings> BookingList;

    private static BookingsRepoIMPL BOOKINGS_REPOSITORY;

    private BookingsRepoIMPL(){this.BookingList= new ArrayList<>();}

    public static BookingsRepoIMPL getBookingList(){
        if(BOOKINGS_REPOSITORY == null)
            BOOKINGS_REPOSITORY = new BookingsRepoIMPL();
        return BOOKINGS_REPOSITORY;
    }
    public Bookings create(Bookings bookings){
        this.BookingList.add(bookings);
        return bookings;
    }

    public Bookings read(String a){
        return this.BookingList.stream().filter(g -> g.getBookingId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Bookings update(Bookings bookings){
        Bookings a = read(bookings.getBookingId());
        if(a != null){
            delete(a.getBookingId());
            return create(bookings);
        }
        return null;
    }
    //PUBLIC BOOLEAN RETURN FALSE
    public boolean delete(String a){
        Bookings bookings = read(a);
        if (bookings != null) this.BookingList.remove(bookings);
        return false;
    }

    public List<Bookings> findAll(){return this.BookingList;}

}
