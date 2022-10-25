package za.ac.cput.Group19CarWash.repository.cleaner;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Cleaner;

import java.util.Optional;

public interface ICleanerRepository extends JpaRepository<Cleaner, Long> {

    void deleteCleanerById(Long CleanerId);

    Optional<Cleaner> findCleanerById(Long CleanerId);
}
