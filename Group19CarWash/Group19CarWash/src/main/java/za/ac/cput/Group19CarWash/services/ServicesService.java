package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Group19CarWash.domain.Services;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.exception.ServicesNotFoundException;
import za.ac.cput.Group19CarWash.repository.services.IServicesRepository;

import java.util.List;
import java.util.UUID;

@Service
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

    public Services findServicesById(Long id) {return iServicesRepository.findServicesById(id).orElseThrow();
    }

    public void deleteServicesById(Long id) {
        iServicesRepository.deleteServicesById(id);
    }

}
