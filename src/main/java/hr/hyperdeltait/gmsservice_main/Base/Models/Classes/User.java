package hr.hyperdeltait.gmsservice_main.Base.Models.Classes;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/** Represents the user entity which has individual subscriptions, group subscriptions, checkins etc.
 *  Main entity of admin panel for subscription management.
 * @ annotations are used for Lombok and Hibernate.
 */
@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {

    /**
     * Represents database id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * Represents user's first name.
     */
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    /**
     * Represents user's surname.
     */
    @Column(name = "surname", nullable = false, length = 100)
    private String surname;

    /**
     * Represents user's date of birth.
     */
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    /**
     * Represents user's gender.
     */
    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    /**
     * Represents user's e-mail.
     * Can be null in database.
     */
    @Column(name = "email", length = 150)
    private String email;

    /**
     * Represents user's phone number.
     * Can be null in database.
     */
    @Column(name = "phone_number", length = 40)
    private String phoneNumber;

    /**
     * Represents user's date of registration to the gym.
     */
    @Column(name = "date_of_registration", nullable = false)
    private LocalDate dateOfRegistration;

    /**
     * Full constructor.
     * @param id
     * @param name
     * @param surname
     * @param dateOfBirth
     * @param gender
     * @param email
     * @param phoneNumber
     * @param dateOfRegistration
     */
    public User(Integer id, String name, String surname, LocalDate dateOfBirth, String gender, String email, String phoneNumber, LocalDate dateOfRegistration) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = dateOfRegistration;
    }
    /**
     * Constructor without id used for saving new users.
     * @param name
     * @param surname
     * @param dateOfBirth
     * @param gender
     * @param email
     * @param phoneNumber
     * @param dateOfRegistration
     */
    public User(String name, String surname, LocalDate dateOfBirth, String gender, String email, String phoneNumber, LocalDate dateOfRegistration) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = dateOfRegistration;
    }
}