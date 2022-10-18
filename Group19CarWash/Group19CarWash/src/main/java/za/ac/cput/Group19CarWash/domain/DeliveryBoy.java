package za.ac.cput.Group19CarWash.domain;

/*
    DeliveryBoy.java
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
public class DeliveryBoy implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String delivBId;
    @Column
    private String delivBFname;
    @Column
    private String delivBSname;
    @Column
    private String delivBCellNr;

    public DeliveryBoy() {
    }

    public DeliveryBoy(Long id, String delivBId, String delivBFname, String delivBSname, String delivBCellNr) {
        this.id = id;
        this.delivBId = delivBId;
        this.delivBFname = delivBFname;
        this.delivBSname = delivBSname;
        this.delivBCellNr = delivBCellNr;
    }

    public DeliveryBoy(Builder builder) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and Setters
    public String getDelivBFname() {
        return this.delivBFname;
    }

    public String getDelivBSname() {
        return this.delivBSname;
    }

    public String getDelivBId() {
        return this.delivBId;
    }

    public void setDelivBId(String ID) {
        this.delivBId = ID;
    }

    public String getDelivBCellNr() {
        return this.delivBCellNr;
    }

    public void setDelivBFname(String name) {
        this.delivBFname = name;
    }

    public void setDelivBSname(String surname) {
        this.delivBSname = surname;
    }

    public void setDelivBCellNr(String cellNr) {
        this.delivBCellNr = cellNr;
    }

    // To String

    @Override
    public String toString() {
        return "DeliveryBoy{" +
                "Id=" + id +
                ", delivBId='" + delivBId + '\'' +

                ", delivBFname=" + delivBFname + '\'' +
                ", delivBSname='" + delivBSname + '\'' +
                ", delivBCellNr='" + delivBCellNr + '\'' +
                '}';
    }

    // Builder Set
    public static class Builder {
        private Long id;
        private String delivBId;
        private String delivBFname;
        private String delivBSname;
        private String delivBCellNr;

        public Builder setId(Long Id) {
            this.id = Id;
            return this;
        }

        public Builder setDelivBId(String ID) {
            this.delivBId = ID;
            return this;
        }

        public Builder setDelivBFname(String name) {
            this.delivBFname = name;
            return this;
        }

        public Builder setDelivBSname(String surname) {
            this.delivBSname = surname;
            return this;
        }

        public Builder setDelivBCellNr(String cellNr) {
            this.delivBCellNr = cellNr;
            return this;
        }

        public Builder copy(DeliveryBoy dBoy) {
            this.id = dBoy.id;

            this.delivBId = dBoy.delivBId;
            this.delivBFname = dBoy.delivBFname;
            this.delivBSname = dBoy.delivBSname;
            this.delivBCellNr = dBoy.delivBCellNr;
            return this;
        }

        public DeliveryBoy build() {
            return new DeliveryBoy(this);
        }
    }
}