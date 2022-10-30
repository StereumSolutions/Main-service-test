package hr.hyperdeltait.gmsservice_main.Base.Interfaces;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.User;
import hr.hyperdeltait.gmsservice_main.Business.UserManager;

import java.util.List;
import java.util.Optional;

/** Service layer interface that is implemented in {@link UserManager}
 * See the above-mentioned class for more information.
 */
public interface IUserManager {

    List<User> findAllUsers();

    Optional<User> findUserById(Integer id);
}
