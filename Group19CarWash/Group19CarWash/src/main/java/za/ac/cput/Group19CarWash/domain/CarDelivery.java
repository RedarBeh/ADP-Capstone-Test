package za.ac.cput.Group19CarWash.domain;

/*
    CarDelivery.java
    Entity for the Upholstery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table
public class CarDelivery implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String carDelivId;
    @Column
    private String date;
    @Column
    private String time;
    // @Column
    // private String delivBId;
    @Column
    private String customerId;

    public CarDelivery() {
    }

    // Private constructors
    public CarDelivery(Long id, String carDelivId, String date, String time, String customerId) {
        this.id = id;
        // this.delivBId = delivBId;
        this.carDelivId = carDelivId;
        this.date = date;
        this.time = time;
        this.customerId = customerId;
    }

    public CarDelivery(Builder builder) {
        this.id = builder.id;

        this.carDelivId = builder.carDelivId;
        this.date = builder.date;
        this.time = builder.time;
        this.customerId = builder.customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and Setters
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

    public String getCarDelivId() {
        return this.carDelivId;
    }

    public void setCarDelivId(String ID) {
        this.carDelivId = ID;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String ID) {
        this.customerId = ID;
    }

    // To String

    @Override
    public String toString() {
        return "CarDelivery{" +
                "Id=" + id +
                ", carDelivId='" + carDelivId + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    // Builder Set
    public static class Builder {
        private Long id;

        private String carDelivId;
        // private String delivBId;
        private String date;
        private String time;
        private String customerId;

        public Builder setId(Long Id) {
            this.id = Id;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setCustomerId(String ID) {
            this.customerId = ID;
            return this;
        }

        public Builder copy(CarDelivery cDelivery) {
            this.id = cDelivery.id;

            // this.delivBId = cDelivery.delivBId;
            this.carDelivId = cDelivery.carDelivId;
            this.date = cDelivery.date;
            this.time = cDelivery.time;
            this.customerId = cDelivery.customerId;
            return this;
        }

        public CarDelivery build() {
            return new CarDelivery(this);
        }
    }
}