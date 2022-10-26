package za.ac.cput.Group19CarWash.services;

/*
  CustomerService.java
  Service for the Customer
  Lyle Haines (217245919)
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.Customer;
import za.ac.cput.Group19CarWash.repository.customer.ICustomerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    public static ICustomerRepository iCustomerRepository;

    @Autowired
    public CustomerService(ICustomerRepository iCustomerRepository){
        this.iCustomerRepository = iCustomerRepository;
    }

    public Customer addCustomer(Customer customer) {
        customer.setCusId(UUID.randomUUID().toString());
        return iCustomerRepository.save(customer);
    }

    public static List<Customer>findAllCustomers() {
        return iCustomerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return iCustomerRepository.findCustomerById(id).orElseThrow();
    }

    public void deleteCustomerById(Long id) {
        iCustomerRepository.deleteCustomerById(id);
    }
}
