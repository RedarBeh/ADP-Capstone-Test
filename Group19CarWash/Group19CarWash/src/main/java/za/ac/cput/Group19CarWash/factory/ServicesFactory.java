package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Services;

public class ServicesFactory {

    public static Services createServices(Long id, String servicesId, String servicesPkg, String washTypeId, String upholsteryId, String customerId, String cleanerId, String totalAmount) {

        Services services = new Services.Builder()
                .setId(id)
                .setServicesId(servicesId)
                .setServicesPkg(servicesPkg)
                .setWashTypeId(washTypeId)
                .setUpholsteryId(upholsteryId)
                .setCustomerId(customerId)
                .setCleanerId(cleanerId)
                .setTotalAmount(totalAmount)
                .build();
        return services;
    }
}