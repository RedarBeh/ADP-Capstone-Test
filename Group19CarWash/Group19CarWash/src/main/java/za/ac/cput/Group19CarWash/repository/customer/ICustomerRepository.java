package za.ac.cput.Group19CarWash.repository.customer;

/*
  ICustomerRepository.java
  IRepository for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Customer;


import java.util.Optional;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    void deleteCustomerById(Long Id);

    Optional<Customer> findCustomerById(Long Id);

}
