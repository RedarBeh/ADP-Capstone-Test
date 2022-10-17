package za.ac.cput.Group19CarWash.domain;

/*
  Payment.java
  Entity for the Payment
  Lyle Haines (217245919)
  10 April 2022
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String paymentId;
    @Column
    private int totalAmount;
    @Column
    private String date;

    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.totalAmount = builder.totalAmount;
        this.date = builder.date;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "Id=" + id +
                "paymentId=" + paymentId +
                ", totalAmount=" + totalAmount +
                ", date=" + date +
                '}';
    }

    public static class Builder {

        private Long id;
        private String paymentId;
        private int totalAmount;
        private String date;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }

        public Builder setPaymentId(String paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setTotalAmount(int totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(Payment payment) {
            this.id = payment.id;
            this.paymentId = payment.paymentId;
            this.totalAmount = payment.totalAmount;
            this.date = payment.date;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}