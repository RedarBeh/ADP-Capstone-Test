package za.ac.cput.Group19CarWash.repository.DeliveryBoy;

/*
    IDeliveryBoyRepository.java
    IRepository for the DeliveryBoy
    Mogammad-Redar Behardien
    10 April 2022
 */

import za.ac.cput.Group19CarWash.domain.DeliveryBoy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IDeliveryBoyRepository extends JpaRepository<DeliveryBoy, String> {
    public List<DeliveryBoy> findAll();

    public void deleteDeliveryBoyById(Long i);

    Optional<DeliveryBoy> findDeliveryBoyById(Long i);
}
