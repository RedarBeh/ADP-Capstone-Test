package za.ac.cput.Group19CarWash.repository.services;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Services;

import java.util.Optional;

public interface IServicesRepository extends JpaRepository<Services, Long> {

    void deleteServicesById(Long Id);

    Optional<Services> findServicesById(Long Id);
}

