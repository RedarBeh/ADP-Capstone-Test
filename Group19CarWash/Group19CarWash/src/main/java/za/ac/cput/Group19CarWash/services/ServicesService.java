package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Group19CarWash.domain.Services;
import za.ac.cput.Group19CarWash.exception.ServicesNotFoundException;
import za.ac.cput.Group19CarWash.repository.services.IServicesRepository;

import java.util.List;
import java.util.UUID;

public class ServicesService {

    private static IServicesRepository iServicesRepository;

    @Autowired
    public ServicesService(IServicesRepository iServicesRepository){this.iServicesRepository= iServicesRepository;}

    public Services addServices(Services services){
        services.setServicesId(UUID.randomUUID().toString());
        return iServicesRepository.save(services);
    }
    public static List<Services> findAllServices(){return iServicesRepository.findAll();}
    public Services updateServices(Services services){return iServicesRepository.save(services);}

    public Services findServicesById(Long id){
        return iServicesRepository.findServicesById(String.valueOf(id)).orElseThrow(() -> new ServicesNotFoundException("Services by Id"+ id + "was not found"));}

    public void deleteServicesrById(Long id){iServicesRepository.deleteServicesById(String.valueOf(id));}

}
