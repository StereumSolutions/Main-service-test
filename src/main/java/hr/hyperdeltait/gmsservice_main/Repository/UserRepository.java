package hr.hyperdeltait.gmsservice_main.Repository;

import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.User;
import org.springframework.data.jpa.repository.JpaRepository;
/** Repository layer of {@link User}.
 * This interface extends JpaRepository, so it implements all CRUD methods.
 *  Additional queries are written here using JPA's language or with native SQL.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}