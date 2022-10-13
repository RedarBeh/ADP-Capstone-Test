/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingsFactory.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.factory;
import za.ac.cput.Group19CarWash.domain.Bookings;
import za.ac.cput.Group19CarWash.util.Helper;

import java.util.UUID;


public class BookingsFactory {
    public static Bookings createBookings(String date, String time, String branchId, String customerId){
        //Long Id = Helper.generateId();
        //String branchId = Helper.generatebranchId();
        //String customerId = Helper.customerId();


        Bookings bookings = new Bookings.Builder()

                .setDate(date)
                .setTime(time)
                .setBranchId(branchId)
                .setCustomerId(customerId)
                .build();
        return bookings;
    }
}

