package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Group19CarWash.domain.Car;
import za.ac.cput.Group19CarWash.repository.car.ICarRepo;

import java.util.List;
import java.util.UUID;

public class CarService {

    public static ICarRepo iCarRepo;

    @Autowired
    public CarService(ICarRepo iCarRepo){this.iCarRepo= iCarRepo;}

    public Car addCar(Car car){
        car.setCarRegId(UUID.randomUUID().toString());
        return iCarRepo.save(car);
    }

    public static List<Car> findAllCars(){return iCarRepo.findAll();}
    public Car updateCar(Car car){return iCarRepo.save(car);}

    public Car findCarById(Long id){
        return iCarRepo.findCarById(id).orElseThrow();
    }

    public void deleteCarById(Long id){iCarRepo.deleteCarById(id);}
}
