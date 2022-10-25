package za.ac.cput.Group19CarWash.repository.cleaner.impl;

import za.ac.cput.Group19CarWash.domain.Cleaner;

import java.util.ArrayList;
import java.util.List;

public class CleanerRepositoryIMPL {
    private final List<Cleaner> CleanerList;

    private static za.ac.cput.Group19CarWash.repository.cleaner.impl.CleanerRepositoryIMPL CLEANER_REPOSITORY;

    private CleanerRepositoryIMPL(){this.CleanerList= new ArrayList<>();}

    public static za.ac.cput.Group19CarWash.repository.cleaner.impl.CleanerRepositoryIMPL getCleanerList(){
        if(CLEANER_REPOSITORY == null)
            CLEANER_REPOSITORY = new za.ac.cput.Group19CarWash.repository.cleaner.impl.CleanerRepositoryIMPL();
        return CLEANER_REPOSITORY;
    }
    public Cleaner create(Cleaner cleaner){
        this.CleanerList.add(cleaner);
        return cleaner;
    }

    public Cleaner read(String a){
        return this.CleanerList.stream().filter(g -> g.getCleanerId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Cleaner update(Cleaner cleaner){
        Cleaner c = read(cleaner.getCleanerId());
        if(c != null){
            delete(c.getAdminId());
            return create(cleaner);
        }
        return null;
    }
    public void delete(String c){
        Cleaner cleaner = read(c);
        if (cleaner != null) this.CleanerList.remove(cleaner);
    }

    public List<Cleaner> findAll(){return this.CleanerList;}

}
