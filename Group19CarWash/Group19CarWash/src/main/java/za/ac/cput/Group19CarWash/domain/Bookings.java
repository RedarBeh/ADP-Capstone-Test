/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
Bookings.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table
public class Bookings implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String bookingId;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private String branchId;
    @Column
    private String customerId;
    //////////////////////Private constructors

    public Bookings(){}

    public Bookings(Long id, String bookingId, String date, String time, String branchId, String customerId) {
        this.id = id;
        this.bookingId = bookingId;
        this.date = date;
        this.time = time;
        this.branchId = branchId;
        this.customerId = customerId;
    }

    public Bookings(Builder builder) {}

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    //////////////////////////////// To String


    @Override
    public String toString() {
        return "Bookings{" +
                "Id=" + id +
                ", bookingId='" + bookingId + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", branchId='" + branchId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    //////////////////////////////Builder Set
    public static class Builder{
        private Long id;
        private String bookingId;
        private String date;
        private String time;
        private String branchId;
        private String customerId;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }
        public Builder setBookingId(String bookingId){
            this.bookingId = bookingId;
            return this;
        }
        public Builder setDate(String date){
            this.date = date;
            return this;
        }
        public Builder setTime(String time){
            this.time = time;
            return this;
        }
        public Builder setBranchId(String branchId){
            this.branchId = branchId;
            return this;
        }
        public Builder setCustomerId(String customerId){
            this.customerId = customerId;
            return this;
        }
        public Builder copy(Bookings bookings){
            this.id = bookings.id;
            this.bookingId = bookings.bookingId;
            this.date = bookings.date;
            this.time = bookings.time;
            this.branchId = bookings.branchId;
            this.customerId = bookings.customerId;
            return this;
        }
        public Bookings build(){return new Bookings(this);}
    }
}
