package za.ac.cput.Group19CarWash.util;

import java.util.UUID;

public class Helper {

    /////////////////
    //public static UUID customerId() { };


    public static boolean isNullorEmpty(String s) {
        return(s == null || s.equals("") || s.isEmpty() || s.equalsIgnoreCase("null"));
    }
}
