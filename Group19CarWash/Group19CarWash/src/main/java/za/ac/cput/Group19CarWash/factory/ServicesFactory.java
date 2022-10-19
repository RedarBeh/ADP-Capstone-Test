package za.ac.cput.Group19CarWash.factory;

import za.ac.cput.Group19CarWash.domain.Services;

public class ServicesFactory {

    public static Services createServices(Long servicesId, String servicesPkg, String washTypeId, String upholsteryId, String customerId, String cleanerId, String totalAmount) {

        Services services = new Services.Builder()
                .setservicesId(servicesId)
                .setservicesPkg(servicesPkg)
                .setwashTypeId(washTypeId)
                .setupholsteryId(upholsteryId)
                .setcustomerId(customerId)
                .setcleanerId(cleanerId)
                .settotalAmount(totalAmount)
                .build();
        return services;
    }
}