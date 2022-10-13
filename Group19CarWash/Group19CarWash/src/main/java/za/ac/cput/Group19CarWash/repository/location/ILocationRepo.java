/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
ILocationRepo.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.repository.location;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Location;

import java.util.Optional;

public interface ILocationRepo extends JpaRepository<Location, Long> {
    void deleteById(Long id);

    Optional<Location> findById(Long id);
}
