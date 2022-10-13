/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
BookingNotFoundException.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.exception;

public class BookingNotFoundException extends  RuntimeException{
    public BookingNotFoundException(String message) {
        super(message);
    }
}
