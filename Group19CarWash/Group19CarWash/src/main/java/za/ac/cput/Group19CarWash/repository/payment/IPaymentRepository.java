package za.ac.cput.Group19CarWash.repository.payment;

/*
  IPaymentRepository.java
  IRepository for the Payment
  Lyle Haines (217245919)
 */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Payment;


import java.util.Optional;

public interface IPaymentRepository extends JpaRepository<Payment, String> {

    void deletePaymentById(Long paymentId);

    Optional<Payment> findPaymentById(Long paymentId);
}
