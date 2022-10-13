/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
IUserRepository.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.repository.user;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import za.ac.cput.Group19CarWash.domain.User;

public interface IUserRepository extends CrudRepository <User, Long>{

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);
}
