package za.ac.cput.Group19CarWash.repository.services.impl;

import za.ac.cput.Group19CarWash.domain.Services;

import java.util.ArrayList;
import java.util.List;

public class ServicesRepositoryIMPL {

    private final List<Services> ServicesList;

    private static ServicesRepositoryIMPL SERVICES_REPOSITORY;

    private ServicesRepositoryIMPL(){this.ServicesList= new ArrayList<>();}

    public static ServicesRepositoryIMPL getServicesList(){
        if(SERVICES_REPOSITORY == null)
            SERVICES_REPOSITORY = new ServicesRepositoryIMPL();
        return SERVICES_REPOSITORY;
    }
    public Services create(Services services){
        this.ServicesList.add(services);
        return services;
    }

    public Services read(String a){
        return this.ServicesList.stream().filter(g -> g.getServicesId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Services update(Services services){
        Services a = read(services.getServicesId());
        if(a != null){
            delete(a.getServicesId());
            return create(services);
        }
        return null;
    }
    public void delete(String a){
        Services services = read(a);
        if (services != null) this.ServicesList.remove(services);
    }

    public List<Services> findAll(){return this.ServicesList;}

}