package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.Upholstery;
import za.ac.cput.Group19CarWash.repository.upholstery.IUpholsteryRepo;

import java.util.List;
import java.util.UUID;

@Service
public class UpholsteryService {

    private static IUpholsteryRepo iUpholsteryRepo;

    @Autowired
    public UpholsteryService(IUpholsteryRepo iUpholsteryRepo){this.iUpholsteryRepo= iUpholsteryRepo;}

    public Upholstery addUpholstery(Upholstery upholstery){
        upholstery.setUpholsteryId(UUID.randomUUID().toString());
        return iUpholsteryRepo.save(upholstery);
    }
    public static List<Upholstery> findAllUpholstery(){return iUpholsteryRepo.findAll();}
    public Upholstery updateUpholstery(Upholstery upholstery){return iUpholsteryRepo.save(upholstery);}

    public Upholstery findUpholsteryById(Long id){
        return iUpholsteryRepo.findUpholsteryById(id).orElseThrow();
    }

    public void deleteUpholsteryById(Long id){iUpholsteryRepo.deleteCarById(id);}
}
