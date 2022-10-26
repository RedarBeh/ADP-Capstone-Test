package za.ac.cput.Group19CarWash.factory;

/*
  CustomerFactory.java
  Factory for the Customer
  Lyle Haines (217245919)
 */

import za.ac.cput.Group19CarWash.domain.Customer;

public class CustomerFactory {

    public static Customer createCustomer(String firstname, String lastname, String address, String cellnr, String carplate) {

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
