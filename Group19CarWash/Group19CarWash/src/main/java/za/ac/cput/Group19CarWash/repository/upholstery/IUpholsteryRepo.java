package za.ac.cput.Group19CarWash.repository.upholstery;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Upholstery;

import java.util.Optional;

public interface IUpholsteryRepo extends JpaRepository<Upholstery, Long> {
    void deleteCarById(Long upholsteryId);

    Optional<Upholstery> findUpholsteryById(Long upholsteryId);
}
