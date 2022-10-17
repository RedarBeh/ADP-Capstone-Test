package za.ac.cput.Group19CarWash.services;

/*
  PaymentService.java
  Service for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.Payment;
import za.ac.cput.Group19CarWash.repository.payment.IPaymentRepository;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentService {

    public static IPaymentRepository iPaymentRepository;

    @Autowired
    public PaymentService(IPaymentRepository iPaymentRepository){
        this.iPaymentRepository = iPaymentRepository;
    }

    public Payment addPayment(Payment payment) {
        payment.setPaymentId(UUID.randomUUID().toString());
        return iPaymentRepository.save(payment);
    }

    public static List<Payment> findAllPayments() {
        return iPaymentRepository.findAll();
    }

    public Payment updatePayment(Payment payment) {
        return iPaymentRepository.save(payment);
    }

    public Payment findPaymentById(Long id) {
        return iPaymentRepository.findPaymentById(id).orElseThrow();
    }

    public void deletePaymentById(Long id) {
        iPaymentRepository.deletePaymentById(id);
    }
}
