package hr.hyperdeltait.gmsservice_main.Business;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.User;
import hr.hyperdeltait.gmsservice_main.Base.Interfaces.IUserManager;
import hr.hyperdeltait.gmsservice_main.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/** Service layer for {@link User} entity methods.
 *  Implements {@link IUserManager}
 */
@Service
public class UserManager implements IUserManager {

    /**
     * Autowiring {@link UserRepository}.
     */
    private final UserRepository userRepository;
    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Fetches all users from database using {@link org.springframework.data.jpa.repository.JpaRepository}.
     * @return A {@link List} of users.
     */
    @Override
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    /**
     * Fetches a specific user from database based on id given to the method.
     * @param id represents id of a user in database.
     * @return Optional<User> if a user is found Optional.empty if user is not found by id.
     */
    @Override
    public Optional<User> findUserById(Integer id){
        return userRepository.findById(id);
    }
}

