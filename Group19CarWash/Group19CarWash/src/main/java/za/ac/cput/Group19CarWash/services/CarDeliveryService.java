package za.ac.cput.Group19CarWash.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.CarDelivery;

//import za.ac.cput.school_management.repository.city.CountryRepository;
import za.ac.cput.Group19CarWash.repository.CarDelivery.ICarDeliveryRepository;
import za.ac.cput.Group19CarWash.exception.CarDeliveryNotFoundException;

//import za.ac.cput.school_management.repository.city.impl.CountryRepositoryIMPL;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class CarDeliveryService {
    private static ICarDeliveryRepository iCarDeliveryRepository;

    @Autowired
    private CarDeliveryService(ICarDeliveryRepository iCarDeliveryRepository) {
        this.iCarDeliveryRepository = iCarDeliveryRepository;
    }

    public CarDelivery addCarDelivery(CarDelivery carDelivery) {
        carDelivery.setCarDelivId(UUID.randomUUID().toString());
        return iCarDeliveryRepository.save(carDelivery);
    }

    // change on both sides to lists
    public static List<CarDelivery> findAllCarDeliveries() {
        return iCarDeliveryRepository.findAll();
    }

    public CarDelivery findCarDeliveryById(Long a) {
        return iCarDeliveryRepository.findCarDeliveryById(a)
                .orElseThrow(() -> new CarDeliveryNotFoundException("Car Delivery by Id" + a + "was not found"));

    }

    public CarDelivery updateCarDelivery(CarDelivery carDelivery) {
        return iCarDeliveryRepository.save(carDelivery);
    }

    public void deleteCarDelivery(Long a) {
        iCarDeliveryRepository.deleteCarDeliveryById(a);
    }

}