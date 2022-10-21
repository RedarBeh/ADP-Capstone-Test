package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Car;

public class CarFactory {
    public static Car createCar(String carModel, String carColour){

        //Long Id = Helper.generateId();
        //String carRegId = Helper.generateCarRegId();
        Car car = new Car.Builder()
                .setCarModel(carModel)
                .setCarColour(carColour)
                .build();
        return car;
    }
}
