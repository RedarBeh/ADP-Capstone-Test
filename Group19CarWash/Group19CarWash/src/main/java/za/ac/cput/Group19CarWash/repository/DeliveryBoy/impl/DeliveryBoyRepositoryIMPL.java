package za.ac.cput.Group19CarWash.repository.DeliveryBoy.impl;

/*
    DeliveryBoyRepository.java
    Repository for the Car Delivery
    Mogammad-Redar Behardien 216234107
    10 April 2022
 */

import za.ac.cput.Group19CarWash.domain.DeliveryBoy;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DeliveryBoyRepositoryIMPL {// } implements IDeliveryBoyRepository {
    private static DeliveryBoyRepositoryIMPL repository;
    private final List<DeliveryBoy> deliveries;

    private DeliveryBoyRepositoryIMPL() {
        deliveries = new ArrayList<DeliveryBoy>();
    }

    ///////////////////// Perform Singleton
    public static DeliveryBoyRepositoryIMPL getDelivBRepository() {
        if (repository == null) {
            repository = new DeliveryBoyRepositoryIMPL();
        }
        return repository;
    }

    /////////////////////////// Override Methods

    public DeliveryBoy create(DeliveryBoy deliveryBoy) {
        this.deliveries.add(deliveryBoy);
        return deliveryBoy;
    }

    public DeliveryBoy save(DeliveryBoy deliveryBoy) {
        boolean deliver = deliveries.add(deliveryBoy);
        if (!deliver) {
            return null;
        }
        return deliveryBoy;
    }

    // @Override
    public DeliveryBoy read(String i) {
        return this.deliveries.stream()
                .filter(d -> d.getDelivBId().equalsIgnoreCase(i)).findAny().orElse(null);
    }

    public DeliveryBoy update(DeliveryBoy deliveryBoy) {
        DeliveryBoy oldDeliveryBoy = read(deliveryBoy.getDelivBId());
        if (oldDeliveryBoy != null) {
            delete(oldDeliveryBoy.getDelivBId());
            return create(deliveryBoy);
        }
        return null;
    }

    public void delete(String id) {
        DeliveryBoy dboy = read(id);
        if (dboy != null)
            this.deliveries.remove(dboy);

    }

    /// @Override
    public List<DeliveryBoy> findAll() {
        return this.deliveries;
    }
}