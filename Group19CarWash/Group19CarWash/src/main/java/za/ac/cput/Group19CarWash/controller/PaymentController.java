package za.ac.cput.Group19CarWash.controller;

/*
  PaymentController.java
  Controller for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Group19CarWash.domain.Payment;
import za.ac.cput.Group19CarWash.services.PaymentService;

import java.util.List;

@RestController
@RequestMapping
public class PaymentController {

    private final PaymentService paymentService;


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping(value = "/allpayments")
    public ResponseEntity<List<Payment>> getAllPayments(){
        List<Payment> payments = paymentService.findAllPayments();
        return new ResponseEntity<>(payments, HttpStatus.OK);
    }

    @GetMapping(value = "/findpayment/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.findPaymentById(id);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }
    @PostMapping(value = "/addpayment")
    public ResponseEntity<Payment>addPayment(@RequestBody Payment payment){
        Payment newPayment = paymentService.addPayment(payment);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }
    @PutMapping(value = "/updatepayment")
    public ResponseEntity<Payment>updatePayments(@RequestBody Payment payment){
        Payment updatePayments = paymentService.updatePayment(payment);
        return new ResponseEntity<>(updatePayments, HttpStatus.OK);
    }
    @DeleteMapping(value = "/deletepayment/{id}")
    public ResponseEntity<?>deletePayment(@PathVariable("id") Long id){
        paymentService.deletePaymentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
