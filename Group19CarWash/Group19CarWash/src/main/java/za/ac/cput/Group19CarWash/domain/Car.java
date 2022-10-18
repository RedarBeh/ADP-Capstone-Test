package za.ac.cput.Group19CarWash.domain;

/*
    Car.java
    Entity for the Car
    Wajedien Samuels (216287820)
    10 April 2022
 */

import javax.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String carRegId;
    @Column
    private String carModel;
    @Column
    private String carColour;

    public Car(){}

    private Car(Builder builder) {
        this.carRegId = builder.carRegId;
        this.carModel = builder.carModel;
        this.carColour = builder.carColour;
    }

    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}

    public String getCarRegId() { return carRegId; }

    public void setCarRegId(String carRegId) {this.carRegId = carRegId; }

    public String getCarModel() {return carModel;}

    public void setCarModel(String carModel) { this.carModel = carModel;}

    public String getCarColour(){return carColour;}

    public void setCarColour(String carColour) {this.carColour = carColour;}

    @Override
    public String toString() {
        return "Car{" +
                "carRegId=" + carRegId +
                ", carModel='" + carModel + '\'' +
                ", carColour='" + carColour + '\'' +
                '}';
    }

    public static class Builder {
        private Long id;
        private String carRegId;
        private String carModel;
        private String carColour;

        public Builder setId(Long Id){
            this.id = Id;
            return this;
        }

        public Builder setCarRegId(String carRegId){
            this.carRegId = carRegId;
            return this;
        }

        public Builder setCarModel(String carModel){
            this.carModel = carModel;
            return this;
        }

        public Builder setCarColour(String carColour){
            this.carColour = carColour;
            return this;
        }

        public Builder copy (Car car) {
            this.carRegId = car.carRegId;
            this.carModel= car.carModel;
            this.carColour=car.carColour;
            return this;
        }

        public Car build(){return new Car(this);}
    }
}
