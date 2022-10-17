package za.ac.cput.Group19CarWash.domain;

/*
  Customer.java
  Entity for the Customer
  Lyle Haines (217245919)
  10 April 2022
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String cusId;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String address;
    @Column
    private int cellnr;
    @Column
    private String carplate;

    public Customer(){}
    private Customer(Builder builder) {
        this.id = builder.id;
        this.cusId = builder.cusId;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.address = builder.address;
        this.cellnr = builder.cellnr;
        this.carplate = builder.carplate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellnr() {
        return cellnr;
    }

    public void setCellnr(int cellnr) {
        this.cellnr = cellnr;
    }

    public String getCarplate() {return carplate;}

    public void setCellnr(String carplate) {
        this.carplate = carplate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + id +
                "cusId=" + cusId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", cellnr=" + cellnr + '\'' +
                ", carplate=" + carplate +
                '}';
    }

    public static class Builder {

        private Long id;
        private String cusId;
        private String firstname;
        private String lastname;
        private String address;
        private int cellnr;
        private String carplate;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }

        public Builder setCusId(String cusId) {
            this.cusId = cusId;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCellnr(int cellnr) {
            this.cellnr = cellnr;
            return this;
        }

        public Builder setCarplate(String carplate) {
            this.address = carplate;
            return this;
        }

        public Builder copy(Customer customer) {
            this.id = customer.id;
            this.cusId = customer.cusId;
            this.firstname = customer.firstname;
            this.lastname = customer.lastname;
            this.address = customer.address;
            this.cellnr = customer.cellnr;
            this.carplate = customer.carplate;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
