package za.ac.cput.Group19CarWash.repository.CarDelivery;

/*
    ICarDeliveryRepository.java
    IRepository for the CarDelivery
    Mogammad-Redar Behardien
    10 April 2022
 */
import org.springframework.data.jpa.repository.JpaRepository;

import za.ac.cput.Group19CarWash.domain.CarDelivery;

import java.util.List;
import java.util.Optional;

public interface ICarDeliveryRepository extends JpaRepository<CarDelivery, String> {
    public List<CarDelivery> findAll();

    public void deleteCarDeliveryById(Long i);

    Optional<CarDelivery> findCarDeliveryById(Long i);
}