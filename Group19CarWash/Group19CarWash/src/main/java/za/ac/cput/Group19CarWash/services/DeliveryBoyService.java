package za.ac.cput.Group19CarWash.services;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import za.ac.cput.Group19CarWash.domain.DeliveryBoy;

//import za.ac.cput.school_management.repository.city.CountryRepository;
import za.ac.cput.Group19CarWash.repository.DeliveryBoy.IDeliveryBoyRepository;

//import za.ac.cput.school_management.repository.city.impl.CountryRepositoryIMPL;
import za.ac.cput.Group19CarWash.repository.DeliveryBoy.impl.DeliveryBoyRepositoryIMPL;
import za.ac.cput.Group19CarWash.exception.DeliveryBoyNotFoundException;

@Service

public class DeliveryBoyService {

    private static IDeliveryBoyRepository iDeliveryBoyRepository;

    /// private ;

    @Autowired
    public DeliveryBoyService(IDeliveryBoyRepository iDeliveryBoyRepository) {
        this.iDeliveryBoyRepository = iDeliveryBoyRepository;
    }

    public DeliveryBoy addDeliveryBoy(DeliveryBoy deliveryBoy) {
        deliveryBoy.setDelivBId(UUID.randomUUID().toString());
        return iDeliveryBoyRepository.save(deliveryBoy);
    }

    // @Override // change on both sides to lists
    public static List<DeliveryBoy> findAllDeliveries() {
        return iDeliveryBoyRepository.findAll();
    }

    public DeliveryBoy updateDeliveries(DeliveryBoy deliveryBoy) {
        return iDeliveryBoyRepository.save(deliveryBoy);
    }

    public DeliveryBoy findDeliveryBoyById(Long id) {
        return iDeliveryBoyRepository.findDeliveryBoyById(id)
                .orElseThrow(() -> new DeliveryBoyNotFoundException("Delivery Boy by Id" + id + "was not found"));
    }

    // @Override
    public void deleteDeliveryBoyById(Long id) {

        iDeliveryBoyRepository.deleteDeliveryBoyById(id);
    }

}
