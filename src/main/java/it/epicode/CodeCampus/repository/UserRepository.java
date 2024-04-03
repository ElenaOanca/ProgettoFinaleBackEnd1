package it.epicode.CodeCampus.repository;




import it.epicode.CodeCampus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


        /*@Query("SELECT u.email FROM User u")
        List<String> getAllEmails();*/

   // Optional<User> findByEmail(String email);

    User findByUsernameAndPassword(String username, String password);

    Optional<User> findById(Long id);
    
    User findByUsername(String username);
}
