package za.ac.cput.Group19CarWash.repository.administrator;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Group19CarWash.domain.Administrator;

import java.util.Optional;

public interface IAdministratorRepository extends JpaRepository<Administrator, Long> {

    void deleteAdminById(Long adminId);

    Optional<Administrator> findAdminById(Long adminId);
}
