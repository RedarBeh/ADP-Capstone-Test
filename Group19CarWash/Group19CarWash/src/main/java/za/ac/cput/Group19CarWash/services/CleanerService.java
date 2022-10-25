package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Group19CarWash.domain.Cleaner;
import za.ac.cput.Group19CarWash.exception.CleanerNotFoundException;
import za.ac.cput.Group19CarWash.repository.cleaner.ICleanerRepository;

import java.util.List;
import java.util.UUID;

public class CleanerService {

    private static ICleanerRepository iCleanerRepository;

    @Autowired

    public CleanerService(ICleanerRepository iCleanerRepository){this.iCleanerRepository= iCleanerRepository;}

    public Cleaner addCleaner(Cleaner cleaner){
        cleaner.setCleanerId(UUID.randomUUID().toString());
        return iCleanerRepository.save(cleaner);
    }
    public static List<Cleaner> findAllCleaner(){return iCleanerRepository.findAll();}
    public Cleaner updateCleaner(Cleaner cleaner){return iCleanerRepository.save(cleaner);}

    public Cleaner findCleanerById(Long id){
        return iCleanerRepository.findCleanerById(Long.valueOf(id)).orElseThrow(() -> new CleanerNotFoundException("Cleaner by Id"+ id + "was not found"));}

    public void deleteAdministratorById(Long id){iCleanerRepository.deleteCleanerById(Long.valueOf(id));}

}
