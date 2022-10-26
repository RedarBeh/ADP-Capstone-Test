package za.ac.cput.Group19CarWash.repository.payment.impl;

/*
  PaymentRepository.java
  Repository for the Payment
  Lyle Haines (217245919)
 */

import za.ac.cput.Group19CarWash.domain.Payment;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.RequestEntity.delete;

public class PaymentRepository {

    private final List<Payment> PaymentList;

    private static PaymentRepository PaymentRepository;

    private PaymentRepository(){this.PaymentList= new ArrayList<>();}

    public static PaymentRepository getPaymentList(){
        if(PaymentRepository == null)
            PaymentRepository = new PaymentRepository();
        return PaymentRepository;
    }

    public Payment create(Payment payment){
        this.PaymentList.add(payment);
        return payment;
    }

    public Payment read(String a){
        return this.PaymentList.stream().filter(g -> g.getPaymentId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Payment update(Payment payment){
        Payment a = read(payment.getPaymentId());
        if(a != null){
            delete(a.getPaymentId());
            return create(payment);
        }
        return null;
    }

    public void delete(String a){
        Payment payment = read(a);
        if (payment != null) this.PaymentList.remove(payment);
    }

    public List<Payment> findAll(){return this.PaymentList;}
}