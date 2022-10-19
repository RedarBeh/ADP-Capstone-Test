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
    private String delivBId;
    @Column
    private String customerId;

    public CarDelivery() {
    }

    // Private constructors
    public CarDelivery(Long id, String delivBId, String carDelivId, String customerId) {
        this.id = id;
        this.delivBId = delivBId;
        this.carDelivId = carDelivId;
        this.customerId = customerId;
    }

    public CarDelivery(Builder builder) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and Setters
    public String getDelivBId() {
        return this.delivBId;
    }

    public void setDelivBId(String ID) {
        this.delivBId = ID;
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
                ", delivBId='" + delivBId + '\'' +
                ", carDelivId='" + carDelivId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    // Builder Set
    public static class Builder {
        private Long id;

        private String carDelivId;
        private String delivBId;
        private String customerId;

        public Builder setId(Long Id) {
            this.id = Id;
            return this;
        }

        public Builder setDelivBId(String ID) {
            this.delivBId = ID;
            return this;
        }

        public Builder setCarDelivId(String ID) {
            this.carDelivId = ID;
            return this;
        }

        public Builder setCustomerId(String ID) {
            this.customerId = ID;
            return this;
        }

        public Builder copy(CarDelivery cDelivery) {
            this.id = cDelivery.id;

            this.delivBId = cDelivery.delivBId;
            this.carDelivId = cDelivery.carDelivId;
            this.customerId = cDelivery.customerId;
            return this;
        }

        public CarDelivery build() {
            return new CarDelivery(this);
        }
    }
}