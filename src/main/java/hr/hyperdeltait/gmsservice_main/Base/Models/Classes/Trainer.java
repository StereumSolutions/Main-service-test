package hr.hyperdeltait.gmsservice_main.Base.Models.Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trainers")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "description", nullable = false, length = 5000)
    private String description;

    @Column(name = "image", length = 100)
    private String image;

    public Trainer(String firstName, String lastName, String description, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.image = image;
    }
}
