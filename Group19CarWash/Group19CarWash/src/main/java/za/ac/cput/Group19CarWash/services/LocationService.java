/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
LocationService.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.Group19CarWash.domain.Location;
import za.ac.cput.Group19CarWash.repository.location.ILocationRepo;

import java.util.List;
import java.util.UUID;


@Service
public class LocationService {

    private static ILocationRepo iLocationRepo;

    @Autowired
    public  LocationService(ILocationRepo iLocationRepo){this.iLocationRepo = iLocationRepo;}

    public Location addLocation(Location location){
        location.setBranchId(UUID.randomUUID().toString());
        return iLocationRepo.save(location);
    }
    public static List<Location>findAllLocations(){return iLocationRepo.findAll();}

    public Location updateLocation(Location location){return iLocationRepo.save(location);}

    public Location findById(Long id){return iLocationRepo.findById(id).orElseThrow();}

    public void deleteById(Long id){iLocationRepo.deleteById(id);}




}
