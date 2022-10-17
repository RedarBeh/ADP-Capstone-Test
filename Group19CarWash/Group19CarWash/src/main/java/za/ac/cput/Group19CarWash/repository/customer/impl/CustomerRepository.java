package za.ac.cput.Group19CarWash.repository.customer.impl;

/*
  CustomerRepository.java
  Repository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import za.ac.cput.Group19CarWash.domain.Customer;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.RequestEntity.delete;

public class CustomerRepository {
    private final List<Customer> CustomerList;

    private static CustomerRepository CustomerRepository;

    private CustomerRepository(){this.CustomerList= new ArrayList<>();}

    public static CustomerRepository getCustomerList(){
        if(CustomerRepository == null)
            CustomerRepository = new CustomerRepository();
        return CustomerRepository;
    }

    public Customer create(Customer customer){
        this.CustomerList.add(customer);
        return customer;
    }

    public Customer read(String a){
        return this.CustomerList.stream().filter(g -> g.getCusId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Customer update(Customer customer){
        Customer a = read(customer.getCusId());
        if(a != null){
            delete(a.getCusId());
            return create(customer);
        }
        return null;
    }

    public void delete(String a){
        Customer customer = read(a);
        if (customer != null) this.CustomerList.remove(customer);
    }

    public List<Customer> findAll(){return this.CustomerList;}
}