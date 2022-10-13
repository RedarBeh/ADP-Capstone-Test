package za.ac.cput.Group19CarWash.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import za.ac.cput.Group19CarWash.domain.User;

public interface IUserRepository extends CrudRepository <User, Long>{

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
