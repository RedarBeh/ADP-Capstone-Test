package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Cleaner;

public class CleanerFactory {
    public static Cleaner createCleaner(Long id, String CleanerId, String CleanerFname, String CleanerSname, String bookingId) {

        Cleaner cleaner = new Cleaner.Builder()
                    .setId(id)
                    .setCleanerId(CleanerId)
                    .setCleanerFname(CleanerFname)
                    .setCleanerSname(CleanerSname)
                    .setBookingId(bookingId)
                    .build();
        return cleaner;
        }
    }

