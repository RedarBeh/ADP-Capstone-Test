package za.ac.cput.Group19CarWash.repository.car.impl;

import za.ac.cput.Group19CarWash.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private final List<Car> CarList;

    public static CarRepository CAR_REPOSITORY;

    private CarRepository(){this.CarList=new ArrayList<>();
    }

    public static CarRepository getCarList(){
        if(CAR_REPOSITORY == null)
            CAR_REPOSITORY = new CarRepository();
        return CAR_REPOSITORY;
    }
    public Car create(Car car){
        this.CarList.add(car);
        return car;
    }

    public Car read(String a) {
        return this.CarList.stream().filter(g -> g.getCarRegId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Car update(Car car){
        Car a = read(car.getCarRegId());
        if(a !=null){
            delete(a.getCarRegId());
            return create(car);
        }
        return null;
    }
    public void delete(String a){
        Car car = read(a);
        if (car !=null) this.CarList.remove(car);
    }

    public List<Car> findAll(){return this.CarList;}

}
