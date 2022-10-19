package za.ac.cput.Group19CarWash.repository.administrator.impl;

import za.ac.cput.Group19CarWash.domain.Administrator;

import java.util.ArrayList;
import java.util.List;

public class AdministratorRepositoryIMPL {
    private final List<Administrator> AdministratorList;

    private static AdministratorRepositoryIMPL ADMINISTRATOR_REPOSITORY;

    private AdministratorRepositoryIMPL(){this.AdministratorList= new ArrayList<>();}

    public static AdministratorRepositoryIMPL getAdministratorList(){
        if(ADMINISTRATOR_REPOSITORY == null)
            ADMINISTRATOR_REPOSITORY = new AdministratorRepositoryIMPL();
        return ADMINISTRATOR_REPOSITORY;
    }
    public Administrator create(Administrator administrator){
        this.AdministratorList.add(administrator);
        return administrator;
    }

    public Administrator read(String a){
        return this.AdministratorList.stream().filter(g -> g.getAdminId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Administrator update(Administrator administrator){
        Administrator a = read(administrator.getAdminId());
        if(a != null){
            delete(a.getAdminId());
            return create(administrator);
        }
        return null;
    }
    public void delete(String a){
        Administrator administrator = read(a);
        if (administrator != null) this.AdministratorList.remove(administrator);
    }

    public List<Administrator> findAll(){return this.AdministratorList;}

}
