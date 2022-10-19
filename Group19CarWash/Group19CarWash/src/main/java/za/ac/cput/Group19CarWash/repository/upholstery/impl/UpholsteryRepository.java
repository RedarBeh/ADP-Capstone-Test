package za.ac.cput.Group19CarWash.repository.upholstery.impl;

import za.ac.cput.Group19CarWash.domain.Upholstery;

import java.util.ArrayList;
import java.util.List;

public class UpholsteryRepository {

    private final List<Upholstery> UpholsteryList;

    private static UpholsteryRepository UPHOLSTERY_REPOSITORY;

    private UpholsteryRepository(){this.UpholsteryList= new ArrayList<>();
    }

    public static UpholsteryRepository getUpholsteryList(){
        if(UPHOLSTERY_REPOSITORY == null)
            UPHOLSTERY_REPOSITORY = new UpholsteryRepository();
        return UPHOLSTERY_REPOSITORY;
    }
    public Upholstery create(Upholstery upholstery){
        this.UpholsteryList.add(upholstery);
        return upholstery;
    }

    public Upholstery read(String a){
        return this.UpholsteryList.stream().filter(g -> g.getUpholsteryId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Upholstery update(Upholstery upholstery){
        Upholstery a = read(upholstery.getUpholsteryId());
        if(a != null){
            delete(a.getUpholsteryId());
            return create(upholstery);
        }
        return null;
    }
    public void delete(String a){
        Upholstery upholstery = read(a);
        if (upholstery != null) this.UpholsteryList.remove(upholstery);
    }

    public List<Upholstery> findAll(){return this.UpholsteryList;}
}
