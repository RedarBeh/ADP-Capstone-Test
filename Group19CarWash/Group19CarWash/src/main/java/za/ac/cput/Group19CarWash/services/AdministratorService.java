package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.Group19CarWash.domain.Administrator;
import za.ac.cput.Group19CarWash.exception.AdministratorNotFoundException;
import za.ac.cput.Group19CarWash.repository.administrator.IAdministratorRepository;

import java.util.List;
import java.util.UUID;

public class AdministratorService {

    private static IAdministratorRepository iAdministratorRepository;

    @Autowired
    public AdministratorService(IAdministratorRepository iAdministratorRepository){this.iAdministratorRepository= iAdministratorRepository;}

    public Administrator addAdministrator(Administrator administrator){
        administrator.setAdminId(UUID.randomUUID().toString());
        return iAdministratorRepository.save(administrator);
    }
    public static List<Administrator> findAllAdministrator(){return iAdministratorRepository.findAll();}
    public Administrator updateAdministrator(Administrator administrator){return iAdministratorRepository.save(administrator);}

    public Administrator findAdminById(Long id){
        return iAdministratorRepository.findAdminById(Long.valueOf(id)).orElseThrow(() -> new AdministratorNotFoundException("Administrator by Id"+ id + "was not found"));}

    public void deleteAdministratorById(Long id){iAdministratorRepository.deleteAdminById(Long.valueOf(id));}

}
