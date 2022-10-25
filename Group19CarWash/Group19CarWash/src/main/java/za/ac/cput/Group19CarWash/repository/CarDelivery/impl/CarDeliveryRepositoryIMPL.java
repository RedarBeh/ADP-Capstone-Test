package za.ac.cput.Group19CarWash.repository.CarDelivery.impl;

/*
    CarDeliveryRepository.java
    Repository for the Car Delivery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */

import za.ac.cput.Group19CarWash.domain.CarDelivery;
//import za.ac.cput.Group19CarWash.repository.CarDelivery.ICarDeliveryRepository;

import java.util.*;

public class CarDeliveryRepositoryIMPL {// } implements ICarDeliveryRepository {
    private static CarDeliveryRepositoryIMPL repository;
    private final List<CarDelivery> deliveries;

    private CarDeliveryRepositoryIMPL() {
        this.deliveries = new ArrayList<CarDelivery>();
    }

    ///////////////////// Perform Singleton
    public static CarDeliveryRepositoryIMPL getRepository() {
        if (repository == null) {
            repository = new CarDeliveryRepositoryIMPL();
        }
        return repository;
    }

    public CarDelivery create(CarDelivery carDelivery) {
        this.deliveries.add(carDelivery);
        return carDelivery;
    }

    public CarDelivery save(CarDelivery carDelivery) {
        boolean deliver = deliveries.add(carDelivery);
        if (!deliver) {
            return null;
        }
        return carDelivery;
    }

    // @Override
    public CarDelivery read(String i) {
        return deliveries.stream()
                .filter(d -> d.getCarDelivId().equalsIgnoreCase(i))
                .findAny().orElse(null);

    }

    public CarDelivery update(CarDelivery carDelivery) {
        CarDelivery oldCarDelivery = read(carDelivery.getCarDelivId());
        if (oldCarDelivery != null) {
            delete(oldCarDelivery.getCarDelivId());
            return create(carDelivery);
        }
        return null;
    }

    public void delete(String i) {
        CarDelivery carDelivery = read(i);
        if (carDelivery != null) {
            this.deliveries.remove(carDelivery);
        }
    }

    // @Override
    public List<CarDelivery> findAll() {
        return this.deliveries;
    }
}