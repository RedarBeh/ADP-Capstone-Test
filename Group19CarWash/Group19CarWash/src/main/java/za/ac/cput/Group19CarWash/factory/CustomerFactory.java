package za.ac.cput.Group19CarWash.factory;

/*
  CustomerFactory.java
  Factory for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String firstname, String lastname, String address, int cellnr, String carplate) {

        //String cusId = Helper.generateId();
        Customer customer = new Customer.Builder()
                .setFirstname(firstname)
                .setLastname(lastname)
                .setAddress(address)
                .setCellnr(cellnr)
                .setCarplate(carplate)
                .build();
        return customer;
    }
}
