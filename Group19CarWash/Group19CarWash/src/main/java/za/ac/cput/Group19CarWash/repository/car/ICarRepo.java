package za.ac.cput.Group19CarWash.repository.car;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Car;

import java.util.Optional;

public interface ICarRepo extends JpaRepository<Car, Long> {
    void deleteCarById(Long carRegId);

    Optional<Car> findCarById(Long carRegId);
}
