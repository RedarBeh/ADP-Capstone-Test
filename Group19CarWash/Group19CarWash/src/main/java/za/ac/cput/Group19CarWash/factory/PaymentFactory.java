package za.ac.cput.Group19CarWash.factory;

/*
  PaymentFactory.java
  Factory for the Payment
  Lyle Haines (217245919)
*/

import za.ac.cput.Group19CarWash.domain.Payment;
import za.ac.cput.Group19CarWash.util.Helper;

public class PaymentFactory {

    public static Payment createPayment(int totalAmount, String date) {

        //String paymentId = Helper.generateId();
        Payment payment = new Payment.Builder()
                .setTotalAmount(totalAmount)
                .build();
        return payment;
    }
}